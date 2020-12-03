import Vue from 'vue'
import Router from 'vue-router'
import Menu from '@/components/Menu'
import Login from '@/view/Login'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'menu',
      component: Menu
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    }
  ]
})
