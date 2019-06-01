var app = getApp()
Page({
  data: {
    phone: '',
    password: '',
    isshow: false,
    ra1: "2",
    ra2: "1",
    ra3: "0",
  },

  //提交表单
  goLogin: function(e) {
    var select = e.detail.value.role;
    var that = this;
    console.log(e.detail.value)
    if (select == this.data.ra1 || select == this.data.ra2 || select == this.data.ra3) {
      wx.request({
        url: "http://localhost:8080/login",
        method: 'post',
        data: e.detail.value,
        success: function(value) {
          if (that.parseInfo(value)) {
            //存储用户信息
            console.log(value);
            app.global.user = value.data.data;
            app.global.header.Cookie = value.cookies[0];
            console.log("cookie:" + app.global.header.Cookie);
            var url;
            if (select == that.data.ra1) {
              url = '/pages/index1/index1'
            } else if (select == that.data.ra2)
              url = '/pages/Bookad/Bookad'
            else if (select == that.data.ra3)
              url = '/pages/systemad/systemad'
            console.log("url:" + url)
            wx.navigateTo({
              url: url
            })
          } else {
            that.toast('用户名或密码错误')
          }
        },
        fail: function(value) {
          that.toast(value);
        }
      })

    } else {
      that.toast("用户不存在");
    }

  },
  parseInfo: function(value) {
    var code = value.data.resultCode;
    if (code == 0)
      return true;
    this.toast("请求失败，原因：" + value.data.message);
    return false;
  },
  toast: function(msg) {
    wx.showToast({
      title: msg,
      icon: 'loading',
      duration: 2000
    })
  }
})