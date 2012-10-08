$(document).ready(function () {
    $("#addUser").click(function () {
        //必须先对提交表单数据数据进行序列化，采用jQuery的serialize()方法
        var params = $("#subUserForm").serialize();
        $.ajax({
            url:'add_user.do',
            type:'post',
            data:params,
            dataType:'json',
            success:function (data) {
            	$("#allUser").empty();
                $(data.userList).each(function (i, value) {
                    $("#allUser").append("<div>输出了：id:" + value.id + ", name: " + value.name + "</div>");
                });

            }
        });
    });

    $("#users").click(function () {
        $.ajax({
            url:'load_allUser.do',
            type:'post',
            data:"{}",
            dataType:'json',
            success:function (data) {
            	$("#allUser").empty();
                $(data.userList).each(function (i, value) {
                    $("#allUser").append("<div>输出了：id:" + value.id + ", name: " + value.name + "</div>");
                });

            }
        });
    });
    
    $("#username").blur(function() {
    	var params = $("#subUserForm").serialize();
		$.ajax({
			url:'checkName.do',
			type:'post',
			data:params,
			dataType:'json',
			success:function (data){
				$("#info").replaceWith("<label id=\"info\">"+data.msg+"</label>");
			}
		});
	});
});