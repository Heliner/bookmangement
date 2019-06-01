// pages/adOutBook/adOutBook.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    book: {
      bookId: '',
      bookName: '',
      author: '',
      translator: '',
      price: '',
      isbnCode: '',
      comeUpTime: '',
      publishCompany: '',
      state: '',
      enteringMen: '',
      enteringDate: ''
    }
  },
  changeInput: function(e) {
    var str = 'book.bookId';
    this.setData({
      [str]: e.detail.value
    })
  },
  volidateBook: function() {
    var that = this;
    wx.request({
      url: "http://localhost:8080/bookAdmin/oneBook",
      method: 'post', header: app.global.header,
      data: {
        bookId: that.data.book.bookId
      },
      success: function(value) {
        if (app.parseInfo(value)) {
          that.setData({
            book:value.data.data
          })
        }else{
          app.toast("图书不存在");
        }
      }
    })
  }, deleteBook: function (e) {
    var that = this;
    wx.request({
      url: "http://localhost:8080/bookAdmin/deleteBook",
      method: 'post', header: app.global.header,
      data:e.detail.value,
      success: function (value) {
        if (app.parseInfo(value)) {
          app.toast("删除成功");
        } else {
          app.toast("图书不存在");
        }
      }
    })
  },
})