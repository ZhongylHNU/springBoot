<template>
  <div>
    <div>姓名：{{ name }}</div>
    <div>性别：{{ gender }}</div>
    <div>学校：{{ school }}</div>
    <div>E-mail：  <a href="http://www.baidu.com">{{ email }}</a> </div>
    <div>身高：{{ height }}</div>
  </div>
  <router-view/>
</template>

<script>
import $ from "jquery";
import { ref } from "vue";

export default {
  name: "App",
  setup: () => {
    let name = ref("");
    let gender = ref("");
    let school = ref("");
    let email = ref("");
    let height = ref("");

    $.ajax({
      url: "http://127.0.0.1:3000/pk/info/",
      type: "get",
      success: resp => {
        console.log(resp);
        name.value = resp.姓名;
        gender.value = resp.性别;
        school.value = resp.学校;
        email.value = resp.mail;
        height.value = resp.身高;
      }
    });

    return {
      name,
      gender,
      school,
      email,
      height,
    }
  }
}

</script>

<style>
</style>
