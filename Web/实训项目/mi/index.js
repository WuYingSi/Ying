window.addEventListener('load', function() {
    // js二维码 通过过渡实现缓动效果
    var code = document.querySelector('.code');
    var cod = document.querySelector('.cod');
    var cod_img = cod.querySelector('img');
    cod.addEventListener('mouseenter', function() {
        code.style.height = 172 + 'px';
    });
    cod.addEventListener('mouseleave', function() {
        code.style.height = 0 + 'px';
    });

    // js购物车下拉
    var spc = document.querySelector('.spc');
    var shopcar = document.querySelector('.shopcar');
    shopcar.addEventListener('mouseenter', function() {
        this.style.backgroundColor = '#fff';
        this.style.color = '#ff6700';
        spc.style.height = 95 + 'px';
    });
    shopcar.addEventListener('mouseleave', function() {
        this.style.backgroundColor = '#424242';
        this.style.color = '#b0b0b0';
        spc.style.height = 0 + 'px';
    });

    // 导航栏下拉
    var nav_a = document.querySelectorAll('.nav_a');
    var nav_dd = document.querySelectorAll('.nav_dd');
    for (var i = 0; i < nav_a.length; i++) {
        nav_a[i].setAttribute('index', i);
        nav_a[i].addEventListener('mouseenter', function() {
            var index = this.getAttribute('index');
            for (var i = 0; i < nav_dd.length; i++) {
                nav_dd[i].style.display = 'none';
            }
            nav_dd[index].style.display = 'block';
            nav_dd[index].style.height = 220 + 'px';
            nav_dd[index].className = 'nav_dd nav_ddb';
        });
        nav_a[i].addEventListener('mouseleave', function() {
            var index = this.getAttribute('index');
            nav_dd[index].style.height = 0 + 'px';
            nav_dd[index].className = 'nav_dd';
        });
    }

    // 搜索框
    var serch = document.querySelector('.serch');
    var serch_ipt = serch.querySelector('.serch input');
    var serch_btn = document.querySelector('.btn');
    var serch_ul = serch.querySelector('ul');
    serch_ipt.addEventListener('focus', function() {
        this.style.borderColor = '#ff6700';
        serch_btn.style.borderColor = '#ff6700';
        serch_ul.style.display = 'block';
    });
    serch_ipt.addEventListener('blur', function() {
        this.style.borderColor = '#e0e0e0';
        serch_btn.style.borderColor = '#e0e0e0';
        serch_ul.style.display = 'none';
    });
    // value循环
    var searchs = ['小米', '手机', '黑鲨5', '冰箱', '电视', '洗衣机', 'Redmi G 2021'];
    var i = 0;
    setInterval(function() {
        serch_ipt.setAttribute('placeholder', searchs[i]);
        if (i == searchs.length - 1) {
            i = -1
        }
        i++;
    }, 3000);

    // 轮播图

    // 左右按钮鼠标经过显示隐藏
    var slide_prev = document.querySelector('.slide_prev');
    var slide_next = document.querySelector('.slide_next');
    slide_next.addEventListener('mouseenter', function() {
        this.style.backgroundColor = '#333333';
    });
    slide_next.addEventListener('mouseleave', function() {
        this.style.backgroundColor = 'transparent';
    });
    slide_prev.addEventListener('mouseenter', function() {
        this.style.backgroundColor = '#333333';
    });
    slide_prev.addEventListener('mouseleave', function() {
        this.style.backgroundColor = 'transparent';
    });

    // 鼠标悬停停止轮播
    var focus = document.querySelector('.focus');
    focus.addEventListener('mouseenter', function() {
        clearInterval(timer);
        timer = null;
    });
    focus.addEventListener('mouseleave', function() {
        timer = setInterval(function() {
            slide_next.click();
        }, 2000);
    })

    // 动态生成圆点

    var slideShow = document.querySelector('.slideshow');
    var slide_dot = document.querySelector('.slide_dot');
    var focusWidth = focus.offsetWidth;
    for (var i = 0; i < slideShow.children.length; i++) {
        var li = document.createElement('li');
        li.setAttribute('index', i);
        slide_dot.appendChild(li);
        li.addEventListener('click', function() {
            for (var i = 0; i < slide_dot.children.length; i++) {
                slide_dot.children[i].style.backgroundColor = '';
            }
            this.style.backgroundColor = '#fafafa';
            num = index;
            circle = index;
            var index = this.getAttribute('index');
            animate(slideShow, -index * focusWidth);
        });
    }
    slide_dot.children[0].style.backgroundColor = '#fafafa';
    var first = slideShow.children[0].cloneNode(true);
    slideShow.appendChild(first);
    var num = 0;
    var circle = 0;
    slide_next.addEventListener('click', function() {
        if (num == slideShow.children.length - 1) {
            slideShow.style.left = 0;
            num = 0;
        }
        num++;
        animate(slideShow, -num * focusWidth);
        circle++;
        if (circle == slide_dot.children.length) {
            circle = 0;
        }
        circleChange();
    });
    slide_prev.addEventListener('click', function() {
        if (num == 0) {
            num = slideShow.children.length - 1;
            slideShow.style.left = -num * focusWidth;
        }
        num--;
        animate(slideShow, -num * focusWidth);

        circle--;
        if (circle < 0) {
            circle = slide_dot.children.length - 1;
        }
        circleChange();
    })

    function circleChange() {
        for (var i = 0; i < slide_dot.children.length; i++) {
            slide_dot.children[i].style.backgroundColor = '';
        }
        slide_dot.children[circle].style.backgroundColor = '#fafafa';
    }

    // 自动轮播
    var timer = setInterval(function() {
        slide_next.click();
    }, 2000);

    // 左侧导航栏
    var dropdown_hd = document.querySelectorAll('.dropdown_hd');
    var dropdown_bdb = document.querySelectorAll('.dropdown_bdb');
    for (var i = 0; i < dropdown_hd.length; i++) {
        dropdown_hd[i].setAttribute('index', i);
        dropdown_hd[i].addEventListener('mouseenter', function() {
            var index = this.getAttribute('index');
            for (var i = 0; i < dropdown_bdb.length; i++) {
                dropdown_bdb[i].style.display = 'none';
            }
            dropdown_bdb[index].style.display = 'flex';
        });
        dropdown_hd[i].addEventListener('mouseleave', function() {
            var index = this.getAttribute('index');
            dropdown_bdb[index].style.display = 'none';
        });
    }

    // 商品模块tab切换
    var tabSwitch_hd = document.querySelector('.tabSwitch_hd');
    var tabSwitch_hd_a = tabSwitch_hd.querySelectorAll('a');
    var tabSwitch_r = document.querySelectorAll('.tabSwitch_r');
    for (var i = 0; i < tabSwitch_hd_a.length; i++) {
        tabSwitch_hd_a[i].setAttribute('index', i);
        tabSwitch_hd_a[i].addEventListener('mouseenter', function() {
            var index = this.getAttribute('index');
            for (var i = 0; i < tabSwitch_hd_a.length; i++) {
                tabSwitch_hd_a[i].className = '';
                tabSwitch_r[i].className = 'tabSwitch_r tabSwitch_r_show';
            }
            this.className = 'hot';
            tabSwitch_r[index].className = 'tabSwitch_r';
        });
        tabSwitch_hd_a[i].addEventListener('mouseleave', function() {
            var index = this.getAttribute('index');
            this.className = 'hot';
            tabSwitch_r[index].className = 'tabSwitch_r';
        });
    }
    // var tabSwitch = document.querySelectorAll('.tabSwitch');
    // console.log(tabSwitch);
    // for (var i = 0; i < tabSwitch.length; i++) {
    //     tabSwitch[i].addEventListener('mouseentr', function() {
    //         var tabSwitch_hd = this.tabSwitch.querySelector('.tabSwitch_hd');
    //         console.log(tabSwitch_hd);
    //         var tabSwitch_hd_a = tabSwitch_hd.querySelectorAll('a');
    //         var tabSwitch_r = this.tabSwitch.querySelectorAll('.tabSwitch_r');
    //         for (var i = 0; i < tabSwitch_hd_a.length; i++) {
    //             tabSwitch_hd_a[i].setAttribute('index', i);
    //             tabSwitch_hd_a[i].addEventListener('mouseenter', function() {
    //                 var index = this.getAttribute('index');
    //                 for (var i = 0; i < tabSwitch_r.length; i++) {
    //                     tabSwitch_hd_a[i].className = '';
    //                     tabSwitch_r[i].className = 'tabSwitch_r tabSwitch_r_show';
    //                 }
    //                 this.className = 'hot';
    //                 tabSwitch_r[index].className = 'tabSwitch_r';
    //             });
    //             tabSwitch_hd_a[i].addEventListener('mouseleave', function() {
    //                 var index = this.getAttribute('index');
    //                 this.className = 'hot';
    //                 tabSwitch_r[index].className = 'tabSwitch_r';
    //             });
    //         }
    //     })
    // }

    // 返回顶部
    var backTop = document.querySelector('.backTop');
    var advertising = document.querySelector('.advertising');
    document.addEventListener('scroll', function() {
        if (window.pageYOffset >= advertising.offsetTop) {
            backTop.style.display = 'block';
        } else {
            backTop.style.display = 'none';
        }
    });
    backTop.addEventListener('click', function() {
        animater(window, 0);
    });

    function animater(obj, target, callback) {
        // console.log(callback);  callback = function() {}  调用的时候 callback()

        // 先清除以前的定时器，只保留当前的一个定时器执行
        clearInterval(obj.timer);
        obj.timer = setInterval(function() {
            // 步长值写到定时器的里面
            // 把我们步长值改为整数 不要出现小数的问题
            // var step = Math.ceil((target - obj.offsetLeft) / 10);
            var step = (target - window.pageYOffset) / 10;
            step = step > 0 ? Math.ceil(step) : Math.floor(step);
            if (window.pageYOffset == target) {
                // 停止动画 本质是停止定时器
                clearInterval(obj.timer);
                // 回调函数写到定时器结束里面
                // if (callback) {
                //     // 调用函数
                //     callback();
                // }
                callback && callback();
            }
            // 把每次加1 这个步长值改为一个慢慢变小的值  步长公式：(目标值 - 现在的位置) / 10
            // obj.style.left = obj.offsetLeft + step + 'px';
            window.scroll(0, window.pageYOffset + step);
        }, 15);
    }
})