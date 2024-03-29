// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import locale from 'element-ui/lib/locale/lang/en'
// import 'element-ui/lib/theme-chalk/index.css'
import './assets/theme/index.css'
import './assets/icon/iconfont.css'

// var axios = require('axios')
// axios.defaults.baseURL = 'https://localhost:8081/api'
// 将API方法绑定到全局
// Vue.prototype.$axios = axios
Vue.config.productionTip = false
Vue.use(ElementUI, { locale })

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>'
})
