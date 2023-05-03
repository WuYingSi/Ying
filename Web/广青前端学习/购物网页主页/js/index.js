// 获取'bao'对象
let body = document.querySelector(".bao");
//获取'dian'对象
let dian = document.querySelector(".dian");
//给'bao'对象做点击事件
body.onclick = function(){
    body.style.background="#f36"
    dian.style.background="#f2"
    dian.style.color="#666"
    bao.style.color="#fff"
}
//给'dian'对象做点击事件
dian.onclick=function(){
    body.style.background="#f2"
    dian.style.background="#f36"
    dian.style.color="#fff"
    bao.style.color="#666"
}