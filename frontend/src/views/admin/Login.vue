<template>
  <div class="m-login">
    <el-row :gutter="20">
      <el-col :span="8" :offset="8" class="login-block">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span class="login-title">MyBlog</span>
          </div>
          <el-form ref="userForm" :model="userForm" :rules="rules" class="m-form">
            <el-form-item prop="account">
              <el-input placeholder="Username" v-model="userForm.account"></el-input>
            </el-form-item>

            <el-form-item prop="password">
              <el-input placeholder="Password" type="password" v-model="userForm.password"></el-input>
            </el-form-item>

            <el-form-item>
              <el-checkbox v-model="checked">Remember me</el-checkbox>
              <router-link to="#">Forgot your password?</router-link>
            </el-form-item>

            <el-form-item class="me-login-button">
              <el-button round @click.native.prevent="login('userForm')">Log in</el-button>
            </el-form-item>
          </el-form>
        </el-card>

      </el-col>
    </el-row>
  </div>
</template>

<script>
  export default {
    name: "Login",
    data() {
      return {
        userForm: {
          account: '',
          password: '',
        },
        rules: {
          account: {
            require: true,
            message: 'please input your username',
            trigger: 'blur'
          },
          password: {
            require: true,
            message: 'please input your password',
            trigger: 'blur'
          }
        },
        checked: true
      }
    },
    methods: {
      login(formName) {
        let that = this
        this.$refs[formName].validate((valid) => {
          if (valid) {
            that.$store.dispatch('login', that.userForm).then(() => {
              that.$router.go(-1)
            }).catch((error) => {
              if (error !== 'error') {
                that.$message({message: error, type: 'error', showClose: true});
              }
            })
          } else {
            return false;
          }
        });
      }
    }
  }
</script>

<style scoped>
  .m-login {

  }

  .box-card {
    margin-top: 140px;
    /*width: 400px;*/
  }

  .login-title {
    text-align: center;
    font-size: 24px;
    font-weight: bolder;
  }

  .m-form {
    /*width: 350px;*/
    margin-left: 20px;
    margin-right: 20px;
  }
</style>
