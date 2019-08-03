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
