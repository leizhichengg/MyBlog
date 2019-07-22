import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/blog/Home'
import Archive from '@/views/blog/Archive'
import Category from '@/views/blog/Category'
import Tag from '@/views/blog/Tag'
import Post from '@/views/blog/Post'
import Login from '@/views/admin/Login'

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
    //Admin
    {
      path: '/admin',
      name: 'Admin',
      component: Login
    },
    {
      path: '/admin/login',
      name: 'Login',
      component: Login
    },
  ]
})
