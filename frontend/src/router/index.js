import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/blog/Home'
import Archive from '@/views/blog/Archive'
import Category from '@/views/blog/Category'
import Tag from '@/views/blog/Tag'
import Post from '@/views/blog/Post'
import Login from '@/views/admin/Login'
import Layout from '../views/admin/Layout'

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
    }]
  },
  {
    path: '/admin/posts',
    component: Layout,
    redirect: '/admin/posts/all-posts',
    name: 'Posts',
    meta: {title: 'Posts', icon: 'posts'},
    children: [
      {
        path: 'all-posts',
        name: 'Allposts',
        component: () => import('@/views/admin/Allposts'),
        // meta: { title: 'Table', icon: 'table' }
      },
      {
        path: 'categories',
        name: 'Categories',
        component: () => import('@/views/admin/Categories'),
        // meta: { title: 'Tree', icon: 'tree' }
      },
      {
        path: 'tags',
        name: 'Tags',
        component: () => import('@/views/admin/Tags'),
        // meta: { title: 'Tree', icon: 'tree' }
      },
    ]
  },
  {
    path: '/admin',
    name: 'Media',
    component: Layout,
    children: [{
      path: 'media',
      name: 'Media',
      component: () => import('@/views/admin/Media'),
      meta: {title: 'Media', icon: 'media'}
    }]
  },
  {
    path: '/admin',
    name: 'Comments',
    component: Layout,
    children: [{
      path: 'comments',
      name: 'Comments',
      component: () => import('@/views/admin/Comments'),
      meta: {title: 'Comments', icon: 'comments'}
    }]
  },
]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
