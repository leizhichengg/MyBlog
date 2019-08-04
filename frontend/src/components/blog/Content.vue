<template>
  <div class="m-content">

    <div class="post-preview"  v-for="b in blogList" :key="b.id">
      <router-link to="/post" class="router-link-active">
        <h2 class="post-title">{{b.title}}</h2>
<!--        <h3 class="post-subtitle">Subtitle test</h3>-->
        <div class="post-content-preview">
          {{b.content}}
        </div>
      </router-link>
      <p class="post-meta">
        Post by *** on {{b.createTime}}
      </p>
      <hr>
    </div>

  </div>
</template>

<script>
  import {getBlogList} from '../../api/blog'

  export default {
    name: 'Content',
    created () {
      this.getBlogList()
    },
    data () {
      return {
        blogList: [],
      }
    },
    methods: {
      getBlogList () {
        getBlogList().then(response => {
          this.blogList = response.data
          console.info(response)
        }).catch(error => {
          if (error !== 'error') {
            this.$message({type: 'error', message: 'get blog list fail!', showClose: true})
          }
        })
      }
    }

  }
</script>

<style scoped>
  .m-content {
    padding-left: 150px;
    padding-right: 20px;
    background: transparent;
  }
.post-preview {
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
  .router-link-active{
    text-decoration: none;
  }
</style>
