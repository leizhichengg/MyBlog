/**
 * Created by Lei on 2019-07-29
 */
import HttpRequest from '@/request/api.request'

export function login(username, password) {
  const data = {
    username,
    password
  }
  return HttpRequest({
    url: '/admin/login',
    method: 'post',
    data
  })
}

export function logout() {
  return HttpRequest({
    url: '/admin/logout',
    method: 'get'
  })
}

// export function getUserInfo() {
//   return request({
//     url: '/users/currentUser',
//     method: 'get'
//   })
// }

// export function register(account, nickname, password) {
//   const data = {
//     account,
//     nickname,
//     password
//   }
//   return request({
//     url: '/register',
//     method: 'post',
//     data
//   })
// }
