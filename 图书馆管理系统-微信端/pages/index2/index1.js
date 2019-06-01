// pages/index1/index1.js
var app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
     value:null,

     booklist:[
       {
       name:'闲适的浪花',
       image:'/image/1.jpg' 
       },
       {
        name: '大道',
        image: '/image/2.jpg' },
       {
         name: '在路上',
         image: '/image/4.jpg'
       },
       {
         name: '小庙村记',
         image: '/image/5.jpg'
       },
       {
         name:'四季箴言',
         image:'/image/6.jpg'
       },
       {
         name: '仙桥记',
         image: '/image/8.jpg'
       },
       {
         name: '目送',
         image: '/image/10.jpg'
       },
       {
         name: '萤火虫',
         image: '/image/12.jpg'
       },
       {
         name: '诗经通读',
         image: '/image/11.jpg'
       }]
  },
  
/*个人中心跳转
   */
  goPersonal:function(){
    console.log("aaaaaaaaaaaaaa"),
    wx.switchTab({
      url: '/pages/readerPersonal/readerPersonal',
    })
  },
  /**
   * 获取输入的值
   */
  Getinput:function(e){
    this.setData({
      value:e.detail.value
    })
    console.log(this.data.value)
  },

  goSearchBook:function(){
    wx.request({
      url: 'http://localhost:8080/Kcsj_3/wxSearchBookInfoServlet?bookname_bookid_author=' + this.data.value,
      success:function(res){
        console.log(res)
        app.globalData.searchBookResult=res.data
      }
    })
    wx.navigateTo({
      url: '/pages/searchResult/searchResult',
    })


  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})