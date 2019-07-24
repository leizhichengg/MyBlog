<template>
  <div class="a-hamburger">
    <i class="el-icon-ali-menu-unfold1"></i>
  </div>
</template>

<script>
  export default {
    name: 'Hamburger'
  }
</script>

<style scoped>
  .a-hamburger {
    width: 40px;
    height: 40px;
    /*font-size: 25px;*/
  }

  .a-hamburger.is-active {
    transform: rotate(180deg);
  }
</style>
