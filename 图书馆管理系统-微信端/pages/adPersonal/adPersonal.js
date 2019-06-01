// pages/adPersonal/adPersonal.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    inputflag: true,
    bookAdmin: {
      adid: '',
      adpassword: '',

      adphone: '',
      ademail: ''
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    this.setData({
      bookAdmin: app.global.user
    })
  },

  goInput: function() {
    this.setData({
      inputflag: false
    })
  },
  goAlter: function(e) {
    var that = this;
    var td = e.detail.value;
    td['adid'] = this.data.bookAdmin.adid;
    console.log(td);
    wx.request({
      url: "http://localhost:8080/bookAdmin/updateBookAdmin",
      method: 'post',
      header: app.global.header,
      data: td,
      success: function(value) {
        if (app.parseInfo(value)) {
          app.toast("更新成功");
        }
      }
    })
  },
})