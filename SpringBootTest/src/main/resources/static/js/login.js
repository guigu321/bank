$(function(){
	$("#logindv").dialog({
		title:"登陆",
		modal:true,  //模板层
		buttons:[{
			
			text:"登陆", 
			width:60,
			handler:function(){
			//获得账号和密码
			var is1=$('input[name="username"]').validatebox("isValid");
			var is2=$('input[name="userpwd"]').validatebox("isValid");
			if(!is1){
				$('input[name="username"]').focus();
			}else if(!is2){
				$('input[name="userpwd"]').focus();
			}else{
				//把数据异步提交到服务器
				$.ajax({
					  url:"login",
					  type:"post",
					  data:{
						  username:$('input[name="username"]').val(),
						  userpwd:$('input[name="userpwd"]').val()
					  },
					  beforeSend:function(){
						  $.messager.progress({
							  text:"正在登陆中。。。。",
						  })
					  },
					  success:function(data){
						  $.messager.progress("close");
						  if(data==1){
							 location.href="index.jsp";
							  
						  }else{
							  $.messager.alert(
								"登陆失败","账号或者密码有误！","warning"
							)  
						  }
					  },
					  error:function(){
						  //关闭进度框
						  $.messager.progress("close");
						  $.messager.alert(
					"登陆失败","服务器挂了，请联系开发人员","warning"
								)
						  
					  }
					
				})
				
			}
				
			}
		}]
		
	})
	 //账号验证
	$('input[name="username"]').validatebox({
		 required: true,  //定义为必填字段。  
		 validType:"length[16,16]",
		 missingMessage:"请输入卡号",
		 invalidMessage:"卡号不能小于16位",
	})
	//密码验证
	$('input[name="userpwd"]').validatebox({
		 required: true,  //定义为必填字段。  
		 missingMessage:"请输入密码",
		 validType:"length[1,20]",
		 invalidMessage:"密码不能小于3位",
	})
	
	
})