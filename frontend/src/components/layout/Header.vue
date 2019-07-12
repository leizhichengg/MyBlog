<template>
  <div class="m-header" style="background-image: url('/static/img/home-bg.jpg')">
    <div class="m-heading">
      <h1>My Blog</h1>
      <span class="subheading">Where there's a will, there's a way.</span>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Header'
}
</script>

<style scoped>
  .m-header {
    background: #ccc scroll;
    background-size: cover;
    padding: 0 50px;
    height: 450px;
    margin-top: -64px;
  }
  .m-heading {
    padding: 150px 0;
    color: white;
    margin-top: 0px;
    font-size: 40px;
  }
  .subheading {
    font-size: 18px;
    line-height: 1.1;
    display: block;
    font-weight: 300;
    margin: 10px 0 0;
  }
</style>
