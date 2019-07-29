<template>
  <section class="app-main">
    <transition name="fade-transform" mode="out-in">
      <router-view :key="key" />
    </transition>
  </section>
</template>

<script>
  export default {
    name: 'Appmain',
    computed: {
      key() {
        return this.$route.path
      }
    }
  }
</script>

<style scoped>
  .app-main {
    /*50 = navbar  */
    /*min-height: calc(100vh);*/
    /*width: 100%;*/
    /*margin-right: -8px;*/
    height: auto;
    position: relative;
    overflow: hidden;
    /*background-color: #f0f0f0;*/
  }
</style>
