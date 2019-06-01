// pages/index1/index1.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    content: null,
    listImg: [
      '/image/slide-1.jpg',
      "/image/slide-2.jpg",
      "/image/slide-3.jpg",
      "/image/slide-4.jpg"
    ],

    text: '图书馆本周周一至周日正常开放，开馆时间：8:20，闭馆时间22:00',
    marqueePace: 1, //滚动速度
    marqueeDistance: 0, //初始滚动距离
    marqueeDistance2: 0,
    marquee2copy_status: false,
    marquee2_margin: 60,
    size: 18,
    orientation: 'left', //滚动方向
    interval: 20 // 时间间隔

  },

  /*个人中心跳转
   */
  goPersonal: function() {
    wx.switchTab({
      url: '/pages/readerPersonal/readerPersonal',
    })
  },
  /**
   * 获取输入的值
   */
  Getinput: function(e) {
    this.setData({
      content: e.detail.value
    })
    console.log(this.data.content)
  },

  goSearchBook: function() {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/searchResult',
      data: {
        content: that.data.content
      },
      header: app.global.header,
      method: 'post',
      success: function(res) {
        console.log(res.data)
        app.global.searchBookResult.tableData = res.data.data.data
        app.global.searchBookResult.currentPage = res.data.data.currentPage
      }
    })
    wx.navigateTo({
      url: '/pages/searchResult/searchResult',
    })
  },
  goDetail: function() {
    wx.navigateTo({
      url: '/pages/detail/etail',
    })
  },

  onShow: function() {
    // 页面显示
    var vm = this;
    var length = vm.data.text.length * vm.data.size; //文字长度
    var windowWidth = wx.getSystemInfoSync().windowWidth; // 屏幕宽度
    vm.setData({
      length: length,
      windowWidth: windowWidth,
      marquee2_margin: length < windowWidth ? windowWidth - length : vm.data.marquee2_margin //当文字长度小于屏幕长度时，需要增加补白
    });

    vm.run2(); // 第一个字消失后立即从右边出现
  },

  run2: function() {
    var vm = this;
    var interval = setInterval(function() {
      if (-vm.data.marqueeDistance2 < vm.data.length) {
        // 如果文字滚动到出现marquee2_margin=30px的白边，就接着显示
        vm.setData({
          marqueeDistance2: vm.data.marqueeDistance2 - vm.data.marqueePace,
          marquee2copy_status: vm.data.length + vm.data.marqueeDistance2 <= vm.data.windowWidth + vm.data.marquee2_margin,
        });
      } else {
        if (-vm.data.marqueeDistance2 >= vm.data.marquee2_margin) { // 当第二条文字滚动到最左边时
          vm.setData({
            marqueeDistance2: vm.data.marquee2_margin // 直接重新滚动
          });
          clearInterval(interval);
          vm.run2();
        } else {
          clearInterval(interval);
          vm.setData({
            marqueeDistance2: -vm.data.windowWidth
          });
          vm.run2();
        }
      }
    }, vm.data.interval);
  }
})