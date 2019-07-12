<template>
  <div class="ivu-col-span-12 ivu-col-sm-offset-12 ivu-col-xs-offset-12 ivu-col-lg-offset-4 ivu-col-md-offset-4 ">
    <div class="post-preview">
      <a href="#">
        <h2 class="post-title">Title test</h2>
        <h3 class="post-subtitle">Subtitle test</h3>
        <div class="post-content-preview">
          content preview testcontent preview testcontent preview testcontent preview testcontent preview testcontent preview testcontent preview test
        </div>
      </a>
      <p class="post-meta">
        Post by *** on July 12, 2019
      </p>
    </div>
    <hr>

    <div class="post-preview">
      <a href="#">
        <h2 class="post-title">Title test</h2>
        <h3 class="post-subtitle">Subtitle test</h3>
        <div class="post-content-preview">
          content preview testcontent preview testcontent preview testcontent preview testcontent preview testcontent preview testcontent preview test
        </div>
      </a>
      <p class="post-meta">
        Post by *** on July 12, 2019
      </p>
    </div>
    <hr>

    <div class="post-preview">
      <a href="#">
        <h2 class="post-title">Title test</h2>
        <h3 class="post-subtitle">Subtitle test</h3>
        <div class="post-content-preview">
          content preview testcontent preview testcontent preview testcontent preview testcontent preview testcontent preview testcontent preview test
        </div>
      </a>
      <p class="post-meta">
        Post by *** on July 12, 2019
      </p>
    </div>
    <hr>

  </div>
</template>

<script>
  export default {
    name: 'Content'
  }
</script>

<style scoped>
.post-preview {
  background: transparent;
  text-align: left;
}
::selection {
  color: #fff;
  text-shadow: none;
  background: #0085a1;
}
.post-title {
  margin-top: 30px;
  color: black;
  font-size: 30px;
  line-height: 1.3;
  margin-bottom: 4px;
}
.post-subtitle {
  color: black;
  font-size: 18px;
  font-weight: 300;
  margin-bottom: 4px;
}
.post-content-preview {
  color: #a3a3a3;
  font-style: italic;
  font-size: 16px;
}
.post-meta {
  font-size: 18px;
  color: #ccc;
  font-style: italic;
  margin-top: 5px;
}
hr {
  margin-top: 20px;
  margin-bottom: 20px;
  border: 0;
  border-top: 1px solid #eee;
}
</style>
