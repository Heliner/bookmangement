// pages/adBorrowBook/adBorrowBook.js
var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    temp: {
      userId: '',
      bookId: '',
      borrowNum: 0
    },
    rec: []
  },

  clearAll: function() {
    this.rec = [];
    this.temp.borrowNum = this.rec.length;
  },
  validateBook: function(e) {
    var _this_data = this.data;
    var _this = this;
    console.log(_this);
    wx.request({
      url: 'http://localhost:8080/bookAdmin/bookInLab',
      method: 'post',
      header: app.global.header,
      data: {
        userId: e.detail.value.userId,
        bookId: e.detail.value.bookId,
        borrowNum: _this.data.temp.borrowNum
      },
      success: function(res) {
        if (app.parseInfo(res)) {
          var bookRec = res.data.data;
          _this.data.rec.push(bookRec);
          var num = 'temp.borrowNum';
          _this.setData({
            rec: _this.data.rec,
            [num]: _this.data.rec.length
          })
        }
      }
    });
  },
  borrowBooks: function(e) {
    var _this = this;
    console.log(this.data.rec);
    wx.request({
      url: 'http://localhost:8080/bookAdmin/borrowBook',
      data: _this.data.rec,
      header: app.global.header,
      method: 'post',
      success: function(res) {
        if (app.parseInfo(res)) {
          app.toast('借阅成功');
        } else {
          app.toast('借阅不成功');
        }
      }
    })
  },
})