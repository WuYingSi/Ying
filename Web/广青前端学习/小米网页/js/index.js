/* 5.16 吴英思编写 */
// 轮播图
// 鼠标运动到该大模块停止轮播
const banner = document.querySelector('.banner')
banner.addEventListener('mouseenter', function () {
    clearInterval(idTime)
})
banner.addEventListener('mouseleave', function () {
    tim()
})
// 获取元素
const img = document.querySelector('.img-list img')// 图片
// 图片数组
const photo = [
    './images/banner/1.webp',
    './images/banner/2.webp',
    './images/banner/3.webp',
    './images/banner/4.webp'
]
let idTime = 0// 定时器id
let i = 0
function tim() {
    idTime = setInterval(function () {
        next.click()
    }, 3000)
}
// 左箭头
const prev = document.querySelector('.prev-next .prev')
prev.addEventListener('click', function () {
    i--
    i = i < 0 ? photo.length - 1 : i
    img.src = photo[i]
    cicActive(i)
})
// 右箭头
const next = document.querySelector('.prev-next .next')
next.addEventListener('click', function () {
    i++
    i = i >= photo.length ? 0 : i
    img.src = photo[i]
    cicActive(i)
})

// 小圆点
const cic = document.querySelectorAll('.pointer a')
// 函数: 小圆点应用active样式
function cicActive(num = 0) {
    for (let k = 0; k < cic.length; k++) {
        cic[k].classList.remove('active')
    }
    cic[num].classList.add('active')
}
for (let i = 0; i < cic.length; i++) {
    cic[i].addEventListener('mouseenter', function () {
        cicActive(i)
    })
}
tim()// 开启定时器

// 小米搜索框
// 获取元素
const input = document.querySelector('.search-form input')// 搜索框
const btn = document.querySelector('.search-form #btn')// 按钮
const li = document.querySelector('.result-list')
// 为文本框应用焦点事件
// 得到焦点
input.addEventListener('focus', function () {
    block()
})
// 失去焦点
input.addEventListener('blur', function () {
    none()
})
// 为按钮应用鼠标事件
// 鼠标经过
btn.addEventListener('mouseenter', function () {
    btn.classList.add('act')
    li.style.display = 'none'
})
// 鼠标离开
btn.addEventListener('mouseleave', function () {
    none()
})
// 搜索框显示
function block() {
    input.style.border = '1px solid #ff6700'
    btn.classList.add('act')
    li.style.display = 'block'
}
// 搜索框隐藏
function none() {
    input.style.border = '1px solid #e0e0e0'
    btn.classList.remove('act')
    li.style.display = 'none'
}
// 浮动侧边栏滚动鼠标后显示
// 获取侧边栏
const side = document.querySelector('.side-bar')
// 获取侧边栏最后的一个元素
const end = document.querySelector('.side-bar .icon-end')
// 获取鼠标滚动事件
window.addEventListener('scroll', function () {
    const n = document.documentElement.scrollTop
    if (n > 0) {
        side.style.opacity = '1'//显示
        end.style.opacity = '0'
    } else if (n === 0) {
        side.style.opacity = '0'// 隐藏
    }
    if (n > 500) {
        end.style.opacity = '1'
    }
})
// 给最后一个模块给定点击事件
end.addEventListener('click', function () {
    animate(end, 0)
})
//滚动条动画滚动效果
function animate(obj, target, callback) {
    //先清除以前的定时器，只保留当前一个在执行
    clearInterval(obj.time);
    obj.time = setInterval(function () {
        //步长值写在定时器里面 ,    步长公式：（目标值-现在值）/10
        let step = (target - window.pageYOffset) / 10;
        //我们将步长写为整数，不要出现小数
        step = step > 0 ? Math.ceil(step) : Math.floor(step);
        if (window.pageYOffset == target) {
            //停止动画
            clearInterval(obj.time);
            //回调函数写在定时器结束里面
            callback && callback();
        }
        window.scroll(0, window.pageYOffset + step);
    }, 15);
}