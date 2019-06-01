// pages/adReturnBook/adReturnBook.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    recs: {
      userId: '',
      bookId: ''
    }
  },
  goReturnBook: function(e) {
    var _this = this;
    console.log(e.detail.value);
    wx.request({
      url: 'http://localhost:8080/bookAdmin/returnBook',
      data: e.detail.value, header: app.global.header,
      // data: {
      //   userId: e.detail.value.userId,
      //   bookId: e.detail.value.bookId
      // },
      method: 'post',
      success: function(res) {
        if (app.parseInfo(res)) {
          app.toast('还书成功');
        } else {
          app.toast('还书不成功');
        }
      }
    })
  }

})