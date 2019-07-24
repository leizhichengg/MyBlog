<template>
  <div class="a-layout">


    <sidebar/>
    <div class="main-container">
      <navbar/>
    </div>
  </div>

</template>

<script>
  import Sidebar from '../../components/admin/sidebar/Sidebar'
  import Navbar from '../../components/admin/Navbar'
  export default {
    name: 'Layout',
    components: {Navbar, Sidebar}
  }
</script>

<style scoped>

</style>
