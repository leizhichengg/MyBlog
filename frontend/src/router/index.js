import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/blog/Home'
import Archive from '@/views/blog/Archive'
import Category from '@/views/blog/Category'
import Tag from '@/views/blog/Tag'
import Post from '@/views/blog/Post'
import Login from '@/views/admin/Login'
import Layout from '../views/admin/Layout'
// import Newpost from '../views/admin/Newpost'

Vue.use(Router)

export const constantRoutes = [
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
    path: '/admin/login',
    name: 'Login',
    component: Login
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
      path: 'posts',
      redirect: 'posts/all-posts',
      name: 'Posts',
      meta: {title: 'Posts', icon: 'posts'},
    }, {
      path: 'posts/all-posts',
      name: 'Tags',
      component: () => import('@/views/admin/Allposts'),
      meta: {title: 'Tag', icon: 'tag'}
    }, {
      path: 'posts/categories',
      name: 'Tags',
      component: () => import('@/views/admin/Categories'),
      meta: {title: 'Tag', icon: 'tag'}
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
    },
    ]
  },

]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({y: 0}),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter () {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
