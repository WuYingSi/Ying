// /* 5.16 吴英思编写 */
window.addEventListener('load', function () {

    var login_hd = document.querySelector('.login_hd');
    var login_hd_a = login_hd.querySelectorAll('a');
    var box = document.querySelector('.box');

    // 首页跳转显示相应的页面
    var temp = location.href;
    var num = temp.indexOf('?') + 1;
    if (temp.charAt(num) == 'l') {
        login_hd_a[1].className = '';
        login_hd_a[0].className = 'current';
        box.style.transform = 'translateX(' + 0 + 'px)';
    }
    if (temp.charAt(num) == 'e') {
        login_hd_a[0].className = '';
        login_hd_a[1].className = 'current';
        box.style.transform = 'translateX(' + -450 + 'px)';
    }
    // 语言切换模块
    var nav = document.querySelector('nav');
    var nav_a = nav.children[3];
    var language = document.querySelector('.language');
    var nav_ico = document.querySelector('.nav_ico');
    nav_a.addEventListener('mouseenter', function () {
        language.style.height = 80 + 'px';
    });
    nav_a.addEventListener('mouseleave', function () {
        language.style.height = 0 + 'px';
    });

    // 账号密码登陆
    var scan = document.querySelector('.scan');
    var menu = document.querySelector('.menu');
    var erweima = document.querySelector('.erweima');
    var login_prompt = document.querySelector('.login_prompt');
    erweima.addEventListener('mouseenter', function () {
        erweima.style.backgroundColor = '#ff6900';
        login_prompt.style.transform = 'scale(' + 1 + ')';
    });
    erweima.addEventListener('mouseleave', function () {
        erweima.style.backgroundColor = '#ffbe99';
        login_prompt.style.transform = 'scale(' + 0 + ')';
    });
    erweima.addEventListener('click', function () {
        menu.style.display = 'none';
        scan.style.display = 'block';
    });

    // 登录页面

    // 获取焦点

    // txt输入框
    var txt_error = document.querySelector('.txt_error');
    var txt = document.querySelector('.txt');
    var txt_big = document.querySelector('.txt_big');
    var txt_min = document.querySelector('.txt_min');
    txt.addEventListener('focus', function () {
        txt.className = 'txt txt_shadow';
        txt_big.className = 'txt_min';
        txt.style.backgroundColor = '#fff';
    });
    txt.addEventListener('blur', function () {
        txt.className = 'txt';
        if (txt.value == '') {
            txt.style.backgroundColor = '#fcf2f3';
            txt_big.className = 'txt_big';
            txt_big.style.color = '#f24645';
            txt_error.style.display = 'block';
        } else {
            txt_error.style.display = 'none';
            txt_big.style.color = '#464646';
            txt.style.backgroundColor = '#f9f9f9';
        }
    });

    // psd输入框
    var psd_error = document.querySelector('.psd_error');
    var psd = document.querySelector('.psd');
    var psd_big = document.querySelector('.psd_big');
    var psd_min = document.querySelector('.psd_min');
    psd.addEventListener('focus', function () {
        psd.className = 'psd txt_shadow';
        psd_big.className = 'psd_min';
        psd.style.backgroundColor = '#fff';
    });
    psd.addEventListener('blur', function () {
        psd.className = 'psd';
        if (psd.value == 0) {
            psd.style.backgroundColor = '#fcf2f3';
            psd_big.className = 'psd_big';
            psd_big.style.color = '#f24645';
            psd_error.style.display = 'block';
        } else {
            psd_error.style.display = 'none';
            psd_big.style.color = '#464646';
            psd.style.backgroundColor = '#f9f9f9';
        }
    });

    // 点击眼睛显示隐藏
    var psd_btn = document.querySelector('.psd_btn');
    var flag = 0;
    psd_btn.addEventListener('click', function () {
        if (flag == 0) {
            psd_btn.innerHTML = '&#xe6a0;';
            psd.type = 'text';
            flag = 1;
        } else {
            psd_btn.innerHTML = '&#xe60c;';
            psd.type = 'password';
            flag = 0;
        }
    });

    // 同意用户协议按钮
    var check_label = document.querySelector('.check');
    var num = 0;
    check_label.addEventListener('click', function () {
        if (num == 0) {
            this.style.backgroundColor = '#ff6900';
            this.style.borderColor = '#ff6900';
            this.innerHTML = '&#xe62f;';
            num = 1;
        } else {
            this.style.backgroundColor = '#f9f9f9';
            this.style.borderColor = '#838383';
            this.innerHTML = '';
            num = 0;
        }
    });

    // 登录按钮
    var login_btn = document.querySelector('.login_btn');
    var check = document.querySelector('#check');
    var check_no = document.querySelector('.check_no');
    txt.addEventListener('input', function () {
        if (txt.value !== '' && psd.value !== '') {
            login_btn.style.backgroundColor = '#ff6900';
            login_btn.addEventListener('click', function () {
                if (check.checked == false) {
                    check_no.style.display = 'block';
                    setTimeout(function () {
                        check_no.style.display = 'none';
                    }, 3000);
                }
            });
        } else {
            login_btn.style.backgroundColor = '#ffcba9';
        }
    });

    psd.addEventListener('input', function () {
        if (txt.value !== '' && psd.value !== '') {
            login_btn.style.backgroundColor = '#ff6900';
            login_btn.addEventListener('click', function () {
                if (check.checked == false) {
                    check_no.style.display = 'block';
                    setTimeout(function () {
                        check_no.style.display = 'none';
                    }, 3000);
                }
            });
        } else {
            login_btn.style.backgroundColor = '#ffcba9';
        }
    });

    // 注册页面

    // 国家/地区
    var region = document.querySelector('.region');
    var region_min = document.querySelector('.region_min');
    var region_error = document.querySelector('.region_error');
    region.addEventListener('focus', function () {
        region.className = 'region txt_shadow';
    });
    region.addEventListener('blur', function () {
        region.className = 'region';
        if (region.value == 0) {
            region.style.backgroundColor = '#fcf2f3';
            region_min.style.color = '#f24645';
            region_error.style.display = 'block';
        } else {
            region_error.style.display = 'none';
            region_min.style.color = '#464646';
            region.style.backgroundColor = '#f9f9f9';
        }
    });

    // 输入手机号
    var phe_error = document.querySelector('.phe_error');
    var phe = document.querySelector('.phe');
    var phe_big = document.querySelector('.phe_big');
    var phe_min = document.querySelector('.phe_min');
    phe.addEventListener('focus', function () {
        phe.className = 'phe txt_shadow';
        phe_big.className = 'phe_min';
        phe.style.backgroundColor = '#fff';
    });
    phe.addEventListener('blur', function () {
        phe.className = 'phe';
        if (phe.value == 0) {
            phe.style.backgroundColor = '#fcf2f3';
            phe_big.className = 'phe_big';
            phe_big.style.color = '#f24645';
            phe_error.style.display = 'block';
        } else {
            phe_error.style.display = 'none';
            phe_big.style.color = '#464646';
            phe.style.backgroundColor = '#f9f9f9';
        }
    });

    // 输入验证码
    var vcod_error = document.querySelector('.vcod_error');
    var vcod = document.querySelector('.vcod');
    var vcod_big = document.querySelector('.vcod_big');
    var vcod_min = document.querySelector('.vcod_min');
    vcod.addEventListener('focus', function () {
        vcod.className = 'vcod txt_shadow';
        vcod_big.className = 'vcod_min';
        vcod.style.backgroundColor = '#fff';
    });
    vcod.addEventListener('blur', function () {
        vcod.className = 'vcod';
        if (vcod.value == 0) {
            vcod.style.backgroundColor = '#fcf2f3';
            vcod_big.className = 'vcod_big';
            vcod_big.style.color = '#f24645';
            vcod_error.style.display = 'block';
        } else {
            vcod_error.style.display = 'none';
            vcod_big.style.color = '#464646';
            vcod.style.backgroundColor = '#f9f9f9';
        }
    });

    // 同意用户协议按钮
    var check_en_label = document.querySelector('.check_en');
    var num1 = 0;
    check_en_label.addEventListener('click', function () {
        if (num1 == 0) {
            this.style.backgroundColor = '#ff6900';
            this.style.borderColor = '#ff6900';
            this.innerHTML = '&#xe62f;';
            num1 = 1;
        } else {
            this.style.backgroundColor = '#f9f9f9';
            this.style.borderColor = '#838383';
            this.innerHTML = '';
            num1 = 0;
        }
    });

    // 注册按钮
    var enroll_btn = document.querySelector('.enroll_btn');
    var check_en = document.querySelector('#check_en');
    var checkb_no = document.querySelector('.checkb_no');

    // 通过监听3个输入框来控制按钮
    region.addEventListener('input', function () {
        if (region.value !== '' && phe.value !== '' && vcod.value !== '') {
            enroll_btn.style.backgroundColor = '#ff6900';
            enroll_btn.addEventListener('click', function () {
                if (check_en.checked == false) {
                    checkb_no.style.display = 'block';
                    setTimeout(function () {
                        checkb_no.style.display = 'none';
                    }, 3000);
                }
            });
        } else {
            enroll_btn.style.backgroundColor = '#ffcba9';
        }
    });
    phe.addEventListener('input', function () {
        if (region.value !== '' && phe.value !== '' && vcod.value !== '') {
            enroll_btn.style.backgroundColor = '#ff6900';
            enroll_btn.addEventListener('click', function () {
                if (check_en.checked == false) {
                    checkb_no.style.display = 'block';
                    setTimeout(function () {
                        checkb_no.style.display = 'none';
                    }, 3000);
                }
            });
        } else {
            enroll_btn.style.backgroundColor = '#ffcba9';
        }
    });
    vcod.addEventListener('input', function () {
        if (region.value !== '' && phe.value !== '' && vcod.value !== '') {
            enroll_btn.style.backgroundColor = '#ff6900';
            enroll_btn.addEventListener('click', function () {
                if (check_en.checked == false) {
                    checkb_no.style.display = 'block';
                    setTimeout(function () {
                        checkb_no.style.display = 'none';
                    }, 3000);
                }
            });
        } else {
            enroll_btn.style.backgroundColor = '#ffcba9';
        }
    });

    // 点击登录/注册实现滑动


    var menu = document.querySelector('.menu');
    var menuWidth = menu.offsetWidth;

    for (var i = 0; i < login_hd_a.length; i++) {
        login_hd_a[i].setAttribute('index', i);
        login_hd_a[i].addEventListener('click', function () {
            var index = this.getAttribute('index');
            for (var i = 0; i < login_hd_a.length; i++) {
                login_hd_a[i].className = '';
            }
            this.className = 'current';
            box.style.transform = 'translateX(' + index * -menuWidth + 'px)';
        });
    }


    // 二维码登录模块

    // 右上角扫描登录
    var pc = document.querySelector('.pc');
    var scan_prompt = document.querySelector('.scan_prompt');
    pc.addEventListener('mouseenter', function () {
        pc.style.backgroundColor = '#ff6900';
        scan_prompt.style.transform = 'scale(' + 1 + ')';
    });
    pc.addEventListener('mouseleave', function () {
        pc.style.backgroundColor = '#ffbe99';
        scan_prompt.style.transform = 'scale(' + 0 + ')';
    });
    pc.addEventListener('click', function () {
        menu.style.display = 'block';
        scan.style.display = 'none';
    });

    // 帮助模块
    var scan_ico = document.querySelector('.scan_ico');
    var scan_ico_a = scan_ico.querySelector('a');
    var scan_help = document.querySelector('.scan_help');
    scan_ico.addEventListener('mouseenter', function () {
        scan_ico_a.style.color = '#ff6900';
        scan_help.style.transform = 'scale(' + 1 + ')';
    });
    scan_ico.addEventListener('mouseleave', function () {
        scan_ico_a.style.color = '#bbbbbb';
        scan_help.style.transform = 'scale(' + 0 + ')';
    });
})


function animate(obj, target, callback) {
    // console.log(callback);  callback = function() {}  调用的时候 callback()

    // 先清除以前的定时器，只保留当前的一个定时器执行
    clearInterval(obj.timer);
    obj.timer = setInterval(function () {
        // 步长值写到定时器的里面
        // 把我们步长值改为整数 不要出现小数的问题
        // var step = Math.ceil((target - obj.offsetLeft) / 10);
        var step = (target - obj.offsetLeft) / 10;
        step = step > 0 ? Math.ceil(step) : Math.floor(step);
        if (obj.offsetLeft <= target) {
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
        obj.style.left = obj.offsetLeft + step + 'px';
    }, 15);
}
// 登录注册切换
// 获取元素
const login = document.querySelectorAll('.tab-tilte li')
// 效果元素
const dl = document.querySelector('.tab_input .dl')
const zc = document.querySelector('.tab_input .zc')
// 点击事件
login[0].addEventListener('click', function () {
    // 先去除样式active
    for (let k = 0; login.length; k++) {
        login[k].classList.remove('active')
    }
    login[0].classList.add('active')
})
login[1].addEventListener('click', function () {
    for (let k = 0; login.length; k++) {
        login[k].classList.remove('active')
    }
    login[1]('active')
})