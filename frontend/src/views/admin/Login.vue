<template>
  <div class="m-login">
    <el-row>
      <el-col :span="8" :offset="8">
        <el-card class="box-card">

          <el-form ref="loginFrom" :model="loginForm" :rules="loginRules" class="login-form" auto-complete="on"
                   label-position="left">

            <div class="title-container">
              <h3 class="login-title">MyBlog</h3>
            </div>

            <el-form-item prop="username">
              <el-input
                ref="username"
                v-model="loginForm.username"
                placeholder="Username"
                prefix-icon="el-icon-ali-user"
                name="username"
                type="text"
                tabindex="1"
                auto-complete="on"
              ></el-input>
            </el-form-item>

            <el-form-item prop="password">
              <el-input
                :key="passwordType"
                ref="password"
                v-model="loginForm.password"
                :type="passwordType"
                placeholder="Password"
                prefix-icon="el-icon-ali-lock"
                name="password"
                tabindex="2"
                auto-complete="on"
                @keyup.enter.native="handleLogin"
                show-password="true"
              ></el-input>
            </el-form-item>

            <el-button :loading="loading" type="primary" style="width:100%;margin-bottom:30px;"
                       @click.native.prevent="handleLogin">Login
            </el-button>

            <div class="tips">
              <span style="margin-right:20px;">username: admin</span>
              <span> password: any</span>
            </div>

          </el-form>

        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
  import {validUsername} from '@/utils/validate'

  export default {
    name: 'Login',
    data () {
      const validateUsername = (rule, value, callback) => {
        if (!validUsername(value)) {
          callback(new Error('Please enter the correct user name'))
        } else {
          callback()
        }
      }
      const validatePassword = (rule, value, callback) => {
        if (value.length < 6) {
          callback(new Error('The password can not be less than 6 digits'))
        } else {
          callback()
        }
      }
      return {
        loginForm: {
          username: 'admin',
          password: '111111'
        },
        loginRules: {
          username: [{required: true, trigger: 'blur', validator: validateUsername}],
          password: [{required: true, trigger: 'blur', validator: validatePassword}]
        },
        loading: false,
        // passwordType: 'password',
        // redirect: undefined
      }
    },
    watch: {
      $route: {
        handler: function (route) {
          this.redirect = route.query && route.query.redirect
        },
        immediate: true
      }
    },
    methods: {
      handleLogin () {
        this.$axios
          .post('/login', {
            username: this.loginForm.username,
            password: this.loginForm.password
          })
          .then(successResponse => {
            this.responseResult = JSON.stringify(successResponse.data)
            if (successResponse.data.code === 200) {
              this.$router.replace({path: '/admin'})
            }
          })
          .catch(failResponse => {
          })
        // this.$refs.loginForm.validate(valid => {
        //   if (valid) {
        //     // this.loading = true
        //     this.$store.dispatch('login', this.loginForm).then(() => {
        //       this.$router.push({path: '/'})
        //       // this.loading = false
        //     }).catch((error) => {
        //       if (error !== 'error') {
        //         this.$message({message: error, type: 'error', showClose: true})
        //       }
        //       // this.loading = false
        //     })
        //   } else {
        //     console.log('error submit!!')
        //     return false
        //   }
        // })
      }
    }
  }
</script>

<style scoped>
  .m-login {

  }

  .box-card {
    margin-top: 30%;
    width: 100%;
    /*horiz-align: center;*/
  }

  .login-title {
    text-align: center;
    font-size: 24px;
    font-weight: bolder;
  }

  .login-form {
    /*width: 350px;*/
    margin-left: 20px;
    margin-right: 20px;
  }

</style>
