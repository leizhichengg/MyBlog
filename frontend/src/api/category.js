/**
 * Created by Lei on 2019-08-04
 */

import HttpRequest from '../request/api.request'

export function getCategoryList () {
  return HttpRequest({
    url: '/category/list',
    method: 'get'
  })
}

// export function getBlogCountByCategory () {
//
// }

export function getHotCategories () {
  return HttpRequest({
    url: '/category/hot',
    method: 'get'
  })
}

export function addCategory (category) {
  return HttpRequest({
    url: '/category/add',
    method: 'post',
    data: category
  })
}

export function updateCategory (category) {
  return HttpRequest({
    url: '/category/update',
    method: 'put',
    data: category
  })
}

export function deleteCategory (category) {
  return HttpRequest({
    url: '/category/delete',
    method: 'delete',
    data: category
  })
}
