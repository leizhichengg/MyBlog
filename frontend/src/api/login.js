/**
 * Created by Lei on 2019-07-29
 */
import request from '@/request'

export function login(account, password) {
  const data = {
    account,
    password
  }
  return request({
    url: '/admin/login',
    method: 'post',
    data
  })
}

export function logout() {
  return request({
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
