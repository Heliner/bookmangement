// pages/readerBorrowing/readerBorrowing.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    borrowednum: 4,
    borrowingnum: 10,
    borrowingInfo: null
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    var that = this;
    wx.request({
      url: 'http://localhost:8080/user/bookReced',
      header: app.global.header,
      success: function(res) {
        console.log(res.data.data);
        if (app.parseInfo(res)) {
          that.setData({
            borrowingInfo: res.data.data
          })
        };
      }
    })
  },
  goIndex: function() {
    wx.navigateTo({
      url: '/pages/index1/index1',
    })
  },

})