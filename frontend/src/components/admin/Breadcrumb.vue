<template>
  <el-breadcrumb class="app-breadcrumb" separator="/">

    <el-breadcrumb-item :to="{ path: '/admin' }">Dashboard</el-breadcrumb-item>
    <el-breadcrumb-item><a href="/">Posts</a></el-breadcrumb-item>
    <el-breadcrumb-item>New post</el-breadcrumb-item>
  </el-breadcrumb>
</template>

<script>
  export default {
    name: 'Breadcrumb'
  }
</script>

<style scoped>
  .app-breadcrumb {
    display: inline-block;
    font-size: 14px;
    line-height: 50px;
    margin-left: 8px;
  }
</style>
