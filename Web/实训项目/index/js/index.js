
function login() {
  var uname = document.getElementById("text").value;
  var psd = document.getElementById("pasw").value;
  if (uname != '' && psd != '') {
    // console.log(uname);
    var add = localStorage.getItem("name")
    var app = localStorage.getItem("pasw")
    // console.log(app,add)
    if (uname == add && psd == app) {
      alert("登录成功")
      window.location.href = "http://127.0.0.1:5500/javascript/%E5%B0%8F%E7%B1%B3%E9%A1%B9%E7%9B%AE/%E9%A1%B5%E9%9D%A2.html";
    } else {
      alert("没有用户名")
    }
  } else {
    alert("账号密码能为空")
  }
}