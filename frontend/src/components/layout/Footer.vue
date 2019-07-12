<template>
  <div class="m-footer">
    <Divider />
    <a class="m-icon" target="_blank" href="#">
      <Icon type="logo-github" size="36" />
    </a>
    &nbsp;&nbsp;
    <a class="m-icon" target="_blank" href="#">
      <Icon type="logo-linkedin" size="36" />
    </a>
    <br>
    <br>
    <p>Copyright © lzc Blog 2019</p>
    <p>Designed by lzc</p>
  </div>
</template>

<script>
export default {
  name: 'Footer',
  data () {
    return {}
  }
}
</script>

<style scoped>
  .m-footer {
    font-size: 16px;
  }
  .m-icon {
    color: black;
  }
</style>
