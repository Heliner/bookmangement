// pages/adAddBook/adAddBook.js
var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    time: '',
    bookId: '123'
  },
  getSeq: function(e) {
    var that = this;
    wx.request({
      url: "http://localhost:8080/bookAdmin/getSequence",
      method: 'post',
      header: app.global.header,
      data: e.detail.value,
      success: function(value) {
        if (app.parseInfo(value)) {
          that.setData({
            bookId: value.data.data
          })
          console.log(value.data.data);
        }
      }
    })
  },
  goAddBook: function(e) {
    var that = this;
    this.setData({
      bookinfo: e.detail.value
    })
    wx.request({
      url: 'http://localhost:8080/bookAdmin/insertBook',
      data: e.detail.value,
      header: app.global.header,
      method: 'post',
      success: function(res) {
        console.log(e.detail.value);
        if (app.parseInfo(res)) {
          wx.showToast({
            title: '入库成功',
          })
        } else {
          wx.showToast({
            title: '入库失败',
          })
        }

      }
    })


  }


})