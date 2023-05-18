//获取宝贝对象
const body = document.querySelector(".bao");
//获取店铺对象
const dian = document.querySelector(".dian");
//给宝贝对象做点击事件
body.addEventListener('click', function () {
    body.style.background = "#f36";
    dian.style.background = "#f2f2f2";
    dian.style.color = "#666"
    body.style.color = "#fff"
})

//给店铺做点击事件
dian.addEventListener('click', function () {
    body.style.background = "#f2f2f2";
    dian.style.background = "#f36";
    dian.style.color = "#fff"
    body.style.color = "#666"
})


//获取今日新品对象
const newday = document.querySelectorAll(".two1")[0]
//获取本周热销对象
const hotday = document.querySelectorAll(".two1")[1]
//获取今日新品对象span
const newdaySpan = document.querySelectorAll(".two11")[0];
//获取本周热销对象span
const hotdaySpan = document.querySelectorAll(".two11")[1];

//第一个10卡片对象
const listone = document.querySelectorAll('.newcard-lists')[0];
const listtwo = document.querySelectorAll('.newcard-lists')[1];
// 点击事件
newday.addEventListener('click', function () {
    hotday.style.color = "#000";
    hotdaySpan.style.borderBottom = '0';
    newday.style.color = '#f36';
    newdaySpan.style.borderBottom = '3px solid #f36';
    //显示
    listtwo.style.display = 'block';
    //隐藏
    listone.style.display = 'none';
})
hotday.addEventListener('click', function () {
    hotday.style.color = "#f36";
    hotdaySpan.style.borderBottom = '3px solid #f36';
    newday.style.color = '#000';
    newdaySpan.style.borderBottom = '0px';
    //隐藏
    listone.style.display = 'block';
    //显示
    listtwo.style.display = 'none';
})

//获取左右箭头对象
const leftBox = document.querySelector(".box-left");
const rightBox = document.querySelector(".box-right");

//获取轮播盒子
const box = document.querySelector('.box');
//获取ul对象
const ulBox = document.querySelectorAll('.box ul li img');
//获取ol对象
const olBox = document.querySelector(".box ol");
//获取li对象
const list = document.querySelectorAll('.box ol li');
//获取一张图的宽度
// const bannerWidth = box.offsetwidth;

let circle = 0
let timerr = 0
let num = 0
// 轮播图


// // 1. 初始数据
const Data = [
    { url: 'images/banner01.jpg' },
    { url: 'images/banner02.jpg' },
    { url: 'images/banner03.jpg' },
    { url: 'images/banner04.jpg' },
    { url: 'images/banner05.jpg' },
    { url: 'images/banner06.jpg' }
]
// // 方法：轮播图切换
function switchover() {
    // 图片切换
    ulBox.src = Data[i].url
    ulBox.style.transition = 'opacity 300ms ease-in-out 0s'
    // 小圆点切换 先选择li里面已经具有active样式的对象进行移除，再添加active样式给新的li
    // document.querySelector('.-indicator .active').classList.remove('active')// 移除小圆点
    // document.querySelector(`.-indicator li:nth-child(${i + 1})`).classList.add('active')// 添加新的小圆点  
}
let i = 0// 索引号
let idTime = 0// 定时器id数
// 方法：重复切换轮播图 定时器 
function Time() {
    return setInterval(function () {
        // right.click()//js自动调用点击事件
        i++
        // 重置
        if (i >= Data.length) {
            i = 0
        }
        switchover()
    }, 5000)
}
idTime = Time() // 调用定时器默认切换
// // 获取元素对象
// const left = document.querySelector('.prev')// 左箭头
// const right = document.querySelector('.next')// 右箭头
// // 左箭头
// // 点击
// left.addEventListener('click', function () {
//     // 切换当前面一级的所有元素
//     i--
//     // 判断 小于0 切换到最后一张图片索引号为Data.length - 1
//     i = i < 0 ? Data.length - 1 : i
//     switchover()
// })
// // 右箭头
// // 点击
// right.addEventListener('click', function () {
//     i++
//     // 判断
//     i = i >= Data.length ? 0 : i
//     switchover()
// })

// // 获取最外层的盒子
// const div = document.querySelector('.')
// // 鼠标经过盒子暂停定时器，离开开启定时器
// // 鼠标经过
// div.addEventListener('mouseenter', function () {
//     // 停止定时器
//     clearInterval(idTime)
// })
// // 鼠标离开
// div.addEventListener('mouseleave', function () {
//     // 开启定时器
//     idTime = Time()
// })





// //给轮播盒子做鼠标移入事件
box.addEventListener('mouseenter', function () {
    leftBox.style.display = 'block';
    rightBox.style.display = 'block';
    //清除定时器
    clearInterval(timerr)
    //清除定时器变量
    timerr = null
})

// //鼠标移出box盒子事件
box.addEventListener('mouseleave', function () {
    leftBox.style.display = 'none';
    rightBox.style.display = 'none';

    //重新开启定时器
    if (timerr === null) {
        timerr = setInterval(function () {
            rightBox.click()
        }, 2000)
    }
})
// //动态生成圆点  (ul的li的长度等于6)
for (let i = 0; i < ulBox.children.length; i++) {
    //创建li标签
    let li = document.createElement('li');
    li.setAttribute("index", i);
    //给圆点设置点击事件
    li.addEventListener('click', function () {
        //通过循环找到ol下面所有的li标签
        for (let j = 0; j < olBox.children.length; j++) {
            //清除所有li标签的class类名
            olBox.children[j].removeAttribute("class")
        }
        //哪个li标签被点击 就添加boxred类名
        this.className = 'boxred';
        const index = this.getAttribute('index');
        circle = index;
        animated(ulBox, -index * bannerWidth);
    })

    //var yidong = index * -bannerWidth;
    //ulBox.style.left = yidong+'px';
    //console.log(yidong);

    //把循环生成li标签往ol添加
    olBox.appendChild(li);
    //给ol盒子里第一个li添加类名 默认第一个高亮
    olBox.children[0].className = 'boxred';
}

leftBox.addEventListener('click', function () {
    num--;
    if (num < 0) {
        num = ulBox.children.length - 1;
        ulBox.style.left = -num * bannerWidth + 'px';
    }
    animated(ulBox, -num * bannerWidth);
    circle--;
    if (circle < 0) {
        circle = olBox.children.length - 1;
    }
    noCircle()
})
rightBox.addEventListener('click', function () {
    num++;
    if (num === olBox.children.length - 1) {
        num = 0;
        ulBox.style.left = 0;
    }
    animated(ulBox, -num * bannerWidth);
    circle++;
    if (circle === olBox.children.length) {
        circle = 0;
    }
    noCircle()
})



//obj代表需要做动画的对象（ul）
//target 目标位置
//callback回调函数

// function animated(obj, target, callback) {
//     //如果多个元素都使用函数
//     clearInterval(obj.timerr);
//     obj, timerr = window.setInterval(function () {
//         //公式（目标值 - 现在的位置）/10 得到步长
//         let step = (target - obj.offsetLeft) / 10;
//         //步长值 如果是正数需要向上取整 如果是负数就向下取整
//         step = step >= 0 ? Math.ceil(step) : Math.floor(step)

//         if (obj.offsetLeft === target) {
//             window.clearInterval(obj.timerr);
//             callback && callback();

//         } else {
//             obj.style.left = obj.offsetLeft + step + 'px';
//         }
//     }, 15)
// }

function noCircle() {
    for (let k = 0; k < olBox.children.length; k++) {
        olBox.children[k].classList = ('class')// 清除小圆点样式
    }
    olBox.children[circle].className = 'boxred' // 添加小圆点样式
}
// //自动轮播
timerr = setInterval(function () {
    rightBox.click()
    Time()
}, 1000)