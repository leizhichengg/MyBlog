<template>
  <div>
    <b-nav/>
    <div class="a-header">
      <h1 class="m-title">Tag</h1>
    </div>
    <b-footer/>
  </div>
</template>

<script>
  import Navbar from '@/components/layout/Navbar'
  import Footer from '@/components/layout/Footer'

  export default {
    name: 'Tag',
    data () {
      return {
        activeIndex: '/tag'
      }
    },
    components: {
      'b-nav': Navbar,
      'b-footer': Footer,

    }
  }
</script>

<style scoped>
  .a-header {
    background: #ccc url("../assets/img/tag-bg.jpg") scroll;
    background-size: cover;
    padding: 0 50px;
    text-align: left;
    width: 1200px;
    margin-left: -28px;
    margin-top: -136px;
    max-width: 100%;
    height: 300px;
    color: white;
  }

  .m-title {
    font-size: 45px;
    padding-top: 150px;
    text-align: center;
  }
</style>
