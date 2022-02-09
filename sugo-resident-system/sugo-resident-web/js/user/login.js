$(function(){
    RUser.init();
})

var RUser = {
    init : function(){

        //后台获取验证码

        //后台获取公钥

        //登录点击事件
        this.userLogin();
    },

    userLogin : function(){
        $("#userLogin").bind("click",function(){
            var userName = $("#username").val();
            var passWord = $("#password").val();
            if('' == userName || typeof userName == 'undefined'){
                alert("用户名不能为空")
                return;
            }
            if('' == passWord || typeof passWord == 'undefined'){
                alert("密码不能为空")
                return;
            }
            location.href = "./index.html";
        })
    }
}