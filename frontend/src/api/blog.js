/**
 * Created by Lei on 2019-08-03
 */

import HttpRequest from '../request/api.request'

export function getBlogList () {
  return HttpRequest({
    url: '/blog/list',
    method: 'get'
  })
}

export function getAllPosts () {
  return HttpRequest({
    url: '/blog/list/allposts',
    method: 'get'
  })
}

export function getHotBlog () {
  return HttpRequest({
    url: '/blog/hot',
    method: 'get'
  })
}

export function getBlogById (id) {
  return HttpRequest({
    url: '/blog/${id}',
    method: 'get'
  })
}

export function getBlogAndView (id) {
  return HttpRequest({
    url: '/blog/view/${id}',
    method: 'get'
  })
}

export function getBlogByCategory (id) {
  return HttpRequest({
    url: '/blog/category/${id}',
    method: 'get'
  })
}

export function getBlogByTag (id) {
  return HttpRequest({
    url: '/blog/tag/${id}',
    method: 'get'
  })
}

export function addBlog (blog) {
  return HttpRequest({
    url: '/blog/add',
    method: 'post',
    data: blog
  })
}

export function updateBlog (blog) {
  return HttpRequest({
    url: '/blog/update',
    method: 'put',
    data: blog
  })
}

export function deleteBlog (blog) {
  return HttpRequest({
    url: '/blog/delete',
    method: 'delete',
    data: blog
  })
}
