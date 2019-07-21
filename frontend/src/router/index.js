import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/Home'
import Archive from '@/views/Archive'
import Category from '@/views/Category'
import Tag from '@/views/Tag'
import Post from '@/views/Post'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/archive',
      name: 'Archive',
      component: Archive
    },
    {
      path: '/category',
      name: 'Category',
      component: Category
    },
    {
      path: '/tag',
      name: 'Tag',
      component: Tag
    },
    {
      path: '/post',
      name: 'Post',
      component: Post
    },
  ]
})
