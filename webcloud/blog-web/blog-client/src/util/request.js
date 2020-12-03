import axios from 'axios'
import qs from 'qs'
// 创建一个axios实例
const service = axios.create({
  // headers: {
  //   'content-type': 'application/json;charset=UTF-8',
  //   'token': 'one'
  // },

  baseURL:process.env.BASE_API_URL,
  withCredentials: false,
  timeout: 5000
})

// 添加请求拦截器
service.interceptors.request.use(config => {
  // 在发送请求之前做某事，比如说 设置token
  // config.headers['Access-Control-Allow-Origin'] = '*';
  // config.headers['X-Token'] = 'xxxxxxxxxxxxxxxxxxx';
  switch (config.method) {
    case "get":
      config.params = qs.stringify(config.params);
      break;
    case "post":
      config.data = qs.stringify(config.data);
      break;
  };
  return config;
}, error => {
  // 请求错误时做些事
  return Promise.reject(error);
});

// 添加响应拦截器
service.interceptors.response.use(response => {
  const res = response.data;
  // 如果返回的状态不是200 就主动报错
  if(res.state != 200){
    return Promise.reject(res.message || 'error')
  }
  return response;
}, error => {
  return Promise.reject(error.response.data); // 返回接口返回的错误信息
})

export default service
