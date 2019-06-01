//app.js
App({
  global: {
    //  userId:null,
    //  flag_login:null,
    header:{
      'Cookie':''
    },
    searchBookResult: {
      tableData:null,
      currentPage:'1'
    },
    
    user: {
    //  userid_adid_adminid:null,
    userId: 123,
    password: 123,
    userName: 'hfl',
    email: '303567469@qq.com',
      adminid:123,
      // AdName:'管理员3',
      adid:'123',
      // AdPassword:'1243',
      // AdPhone:'1572331'
    },
    borrowingInfo: [],
    borrowInfo: []
  },
  parseInfo: function(value) {
    var code = value.data.resultCode;
    console.log(value.data)
    if (code == 0)
      return true;
    console.log("msg:" + value.data.message);
    wx.showToast({
      title: value.data.message,
      icon: 'loading',
      duration: 2000
    })
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