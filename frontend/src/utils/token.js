/**
 * Created by Lei on 2019-07-29
 */
export function getToken() {
  return localStorage.token
}

export function setToken(token) {
  return localStorage.token = token
}

export function removeToken() {
  return localStorage.removeItem('token')
}
