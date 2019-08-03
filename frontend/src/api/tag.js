/**
 * Created by Lei on 2019-08-03
 */

import HttpRequest from '../request/api.request'

export function getTagList () {
  return HttpRequest({
    url: '/tag/list',
    method: 'get'
  })
}

export function getHotTags () {
  return HttpRequest({
    url: '/tag/hot',
    method: 'get'
  })
}

export function addTag (tag) {
  return HttpRequest({
    url: '/tag/add',
    method: 'post',
    data: tag
  })
}

export function updateTag (tag) {
  return HttpRequest({
    url: '/tag/update',
    method: 'put',
    data: tag
  })
}

export function deleteTag (tag) {
  return HttpRequest({
    url: '/tag/delete',
    method: 'delete',
    data: tag
  })
}
