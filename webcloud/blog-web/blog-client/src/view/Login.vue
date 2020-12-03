<template>
  <div class="login-card">
    <el-card shadow="hover" :style="card_st">
      <el-form :model="ruleForm" status-icon ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="用户名" prop="username">
          <el-input type="text" v-model="ruleForm.username"></el-input>
        </el-form-item>
        <el-form-item label="确认密码" prop="password">
          <el-input type="password" v-model="ruleForm.password" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm()">提交</el-button>
          <el-button @click="resetForm()">重置</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script>
  import { login } from '@/interface/user'
    export default {
        name: "Login",
      data() {
        return {
          ruleForm: {
            username: '',
            password: '',
          },
          card_st:{
             width:'25%',
             marginTop:window.outerHeight/3+'px',
             marginLeft:window.outerWidth/3+'px',
             float:"left"
          }
        };
      },
      methods: {
        submitForm() {
          login(this.ruleForm).then((res)=>{
            this.$router.push('/');
          }).catch(()=>{
            console.log(1);
          })
        },
        resetForm() {

        },

      }
    }
</script>

<style scoped>
  .login-card{
    height: 845px;
   background-image: url("../assets/backgroud.jpg");
  }
</style>
