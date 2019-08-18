import Vue from 'vue'
import Router from 'vue-router'
// import Home from '@/views/blog/Home'
// import Archive from '@/views/blog/Archive'
// import Category from '@/views/blog/Category'
// import Tag from '@/views/blog/Tag'
// import Post from '@/views/blog/Post'
// import Login from '@/views/admin/Login'
import Layout from '../views/admin/Layout'
import Newpost from '../views/admin/Newpost'

Vue.use(Router)

export const constantRoutes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('@/views/blog/Home')
  },
  {
    path: '/archive',
    name: 'Archive',
    component: () => import('@/views/blog/Archive')
  },
  {
    path: '/category',
    name: 'Category',
    component: () => import('@/views/blog/Category')
  },
  {
    path: '/tag',
    name: 'Tag',
    component: () => import('@/views/blog/Tag')
  },
  {
    path: '/post',
    name: 'Post',
    component: () => import('@/views/blog/Post')
  },

  //Admin
  {
    path: '/admin/login',
    name: 'Login',
    component: () => import('@/views/admin/Login')
  },
  {
    path: '/admin',
    name: 'Dashboard',
    component: Layout,
    redirect: '/admin/dashboard',
    children: [{
      path: 'dashboard',
      name: 'Dashboard',
      component: () => import('@/views/admin/Dashboard'),
      meta: {title: 'Dashboard', icon: 'dashboard'}
    }, {
      path: 'posts/all-posts',
      name: 'AllPosts',
      component: () => import('@/views/admin/PostsList'),
      meta: {title: 'AllPosts', icon: 'allPosts'}
    }, {
      path: 'posts/new-post',
      name: 'NewPosts',
      component: () => import('@/views/admin/Newpost'),
      meta: {title: 'Newpost', icon: 'newpost'}
    }, {
      path: 'posts/categories',
      name: 'Categories',
      component: () => import('@/views/admin/Categories'),
      meta: {title: 'Category', icon: 'category'}
    }, {
      path: 'posts/tags',
      name: 'Tags',
      component: () => import('@/views/admin/Tags'),
      meta: {title: 'Tag', icon: 'tag'}
    }, {
      path: 'media',
      name: 'Media',
      component: () => import('@/views/admin/Media'),
      meta: {title: 'Media', icon: 'media'}
    }, {
      path: 'comments',
      name: 'Comments',
      component: () => import('@/views/admin/Comments'),
      meta: {title: 'Comments', icon: 'comments'}
    }]
  },

]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({y: 0}),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
// export function resetRouter () {
//   const newRouter = createRouter()
//   router.matcher = newRouter.matcher // reset router
// }

export default router
