<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<TITLE>中国移动业务管理系统</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<META content="MSHTML 6.00.2600.0" name=GENERATOR>
<link href="style.css" rel="stylesheet" type="text/css">
<style type="text/css">
 #searchresult
 {
  width: 130px;
  position: absolute;
  z-index: 1;
  overflow: hidden;
  left: 130px;
  top: 71px;
  background: #E0E0E0;
  border-top: none;
 }
 .line
 {
  font-size: 12px;
  background: #E0E0E0;
  width: 130px;
  padding: 2px;
 }
 .hover
 {
  background: #007ab8;
  width: 130px;
  color: #fff;
 }
 .std
 {
  width: 150px;
 }
</style>
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		alert("载入了")
		$("#txt_search").keyup(function(evt){
		//	alert($("#txt_search").val())
				ChangeCoords(); //控制查询结果div坐标
				var k = window.event ? evt.keyCode : evt.which;
				//输入框的id为txt_search，这里监听输入框的keyup事件
				//不为空 && 不为上箭头或下箭头或回车
				if ($("#txt_search").val()!= "" && k!=38&& k!= 40 && k != 13) {
					//$.ajax({
						//		type : "Post",
								//async: false, //同步执行，不然会有问题
							//	dataType : "json",
								//url : "addUserMobile.do", //提交的页面/方法名
							//	data :{"a":"n"}, 
									//'{"mobile_Number":'+$("#txt_search").val() +',"a":"n"}',
						//		contentType : "application/json; charset=utf-8",
						//		error : function(msg) {//请求失败处理函数
						//			alert("数据加载失败");
						//		},
						//		success : function(data) { //请求成功后处理函数。
							$.get("addUserMobile.do",{mobile_Number:$("#txt_search").val()},function(data){
						
							//	var objData = eval("(" + data.d+ ")");
									if (data.length > 0){
										var str = "";
										str = "<table id='aa'>";
										for(var i=0;i<data.length;i++){
											//alert(data[i])
											str += "<tr class='line'><td class='std'>"+ data[i]+ "</td></tr>";
										}
										 str+= "</table>";
										//将结果添加到div中
										$("#searchresult").empty();
										$("#searchresult").append(str);
										$(".line:first").addClass("hover");
										$("#searchresult").css("display", "");
										//鼠标移动
										$(".line").hover(function() {$(".line").removeClass("hover");
															$(this).addClass("hover");},
														function() {
															$(this)
																	.removeClass(
																			"hover");
															//$("#searchresult").css("display", "none");
														});
										//鼠标点击事件
										$(".line")
												.click(
														function() {
															$("#txt_search").val(
																			$(this).text());
															$("#searchresult").css("display","none");
														});
									} else {
										$("#searchresult").empty();
										$("#searchresult").css(
												"display", "none");
									}
								//}
						},"json");
						
				} else if (k == 38) {//上
					$('#aa tr.hover').prev().addClass("hover");
					$('#aa tr.hover').next().removeClass("hover");
					$('#txt_search').val($('#aa tr.hover').text());
				} else if (k == 40) {//下
					$('#aa tr.hover').next().addClass("hover");
					$('#aa tr.hover').prev().removeClass("hover");
					$('#txt_search').val($('#aa tr.hover').text());
				} else if (k == 13) {//回车
					$('#txt_search').val($('#aa tr.hover').text());
					$("#searchresult").empty();
					$("#searchresult").css("display", "none");
				} else {
					$("#searchresult").empty();
					$("#searchresult").css("display", "none");
				}
			});
	$("#searchresult").bind("mouseleave", function() {
	$("#searchresult").empty();
	$("#searchresult").css("display", "none");
});

					
	});
	//设置查询结果div坐标
	function ChangeCoords() {
		// var left = $("#txt_search")[0].offsetLeft; //获取距离最左端的距离，像素，整型
		// var top = $("#txt_search")[0].offsetTop + 26; //获取距离最顶端的距离，像素，整型（20为搜索输入框的高度）
		var left = $("#txt_search").position().left; //获取距离最左端的距离，像素，整型
		var top = $("#txt_search").position().top + 20;
		; //获取距离最顶端的距离，像素，整型（20为搜索输入框的高度）
		$("#searchresult").css("left", left + "px"); //重新定义CSS属性
		$("#searchresult").css("top", top + "px"); //同上
	}
</script>


</HEAD>
<BODY bgColor=#ffffff leftMargin=0 topMargin=0 marginheight="0"
	marginwidth="0">
	<CENTER>
		<TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
			<TBODY>
				<TR>
					<TD width=173><A href="http://www.chinamobile.com/index.asp"><IMG
							height=74 src="images/logo.gif" width=173 border=0></A></TD>
					<TD vAlign=top align=right>
						<TABLE width="100%" border=0 cellPadding=0 cellSpacing=0>
							<TBODY>
								<TR bgColor=#2650a6>
									<TD height="12"><img src="images/spacer.gif" width="1"
										height="1"></TD>
									<TD height="12"><img src="images/spacer.gif" width="1"
										height="1"></TD>
									<TD height="12"><img src="images/spacer.gif" width="1"
										height="1"></TD>
									<TD height="12"><img src="images/spacer.gif" width="1"
										height="1"></TD>
									<TD height="12"><img src="images/spacer.gif" width="1"
										height="1"></TD>
								</TR>
								<TR bgColor=#FFFFFF>
									<TD><img src="images/spacer.gif" width="1" height="1"></TD>
									<TD><img src="images/spacer.gif" width="1" height="1"></TD>
									<TD><img src="images/spacer.gif" width="1" height="1"></TD>
									<TD><img src="images/spacer.gif" width="1" height="1"></TD>
									<TD><img src="images/spacer.gif" width="1" height="1"></TD>
								</TR>
								<TR>
									<TD><img src="images/pic01.gif" width="115" height="55"></TD>
									<TD><img src="images/pic04.gif" width="115" height="55"></TD>
									<TD><img src="images/pic03.gif" width="115" height="55"></TD>
									<TD><img src="images/pic02.gif" width="115" height="55"></TD>
									<TD><img src="images/pic05.gif" width="115" height="55"></TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
				</TR>
				<TR>
					<TD height="12" colSpan=2 align=right bgColor=#d4dced><img
						src="images/spacer.gif" width="1" height="1">
						<TABLE cellSpacing=0 cellPadding=0 border=0>
							<TBODY>
								<TR>
								</TR>
							</TBODY>
						</TABLE></TD>
				</TR>
				<TR>
					<TD colSpan=2><IMG height=2 src="images\blank(1).gif" width=1></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width=749 border=0>
			<TBODY>
				<TR vAlign=top>
					<TD width=173 bgColor=#c9d3e9 rowSpan=2>
						<TABLE cellSpacing=0 cellPadding=0 width=173 border=0>
							<TBODY>
								<!--TR>
          <TD width=11 height="29" bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="newOperator.htm">新增操作员</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="modifyOperator.htm">修改操作员</A></TD>
        </TR-->
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>
								<TR>

								</TR>
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="中国移动通信.files/blank.gif" width=1 border=0></TD>
								</TR>
								<TR>
									<TD width=11 bgColor=#2650a6><IMG height=1
										src="images/blank.gif" width=1 border=0><img
										src="images/Arrow1.gif" width="23" height="23"></TD>
									<TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
										class=nav href="resource.jsp">资源管理</A></TD>
								</TR>
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>
								<TR>
									<TD width=11 bgColor=#2650a6><IMG height=1
										src="images/blank.gif" width=1 border=0><img
										src="images/Arrow1.gif" width="23" height="23"></TD>
									<TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
										class=nav href="charge.jsp">配置业务费用</A></TD>
								</TR>
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>
								<TR>
									<!--TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="#"></A></TD-->
								</TR>
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>
								<TR>
									<TD width=11 bgColor=#2650a6><IMG height=1
										src="images/blank.gif" width=1 border=0><img
										src="images/Arrow1.gif" width="23" height="23"></TD>
									<TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
										class=nav href="newCustomer.jsp">开户</A></TD>
								</TR>
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>
								<!--TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="newUser.htm">录入用户信息</A></TD>
        </TR>
        <TR>
          <TD bgColor=#ffffff colSpan=2><IMG height=1 
            src="images/blank.gif" width=1 border=0></TD></TR>
        <TR>
          <TD width=11 bgColor=#2650a6><IMG height=1 
            src="images/blank.gif" width=1 border=0><img src="images/Arrow1.gif" width="23" height="23"></TD>
          <TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A 
            class=nav 
            href="newAccount.htm">录入账户信息</A></TD>
        </TR-->

								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>
								<TR>

								</TR>
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>
								<TR>
									<TD width=11 bgColor=#2650a6><IMG height=1
										src="images/blank.gif" width=1 border=0><img
										src="images/Arrow1.gif" width="23" height="23"></TD>
									<TD width=165 height="29" bgColor=#7691c7>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A
										class=nav href="index.jsp">退出</A></TD>
								</TR>
								<TR>
									<TD bgColor=#ffffff colSpan=2><IMG height=1
										src="images/blank.gif" width=1 border=0></TD>
								</TR>

								<TR align=middle>
									<TD colSpan=2 height=160>&nbsp;</TD>
								</TR>
								<TR>
									<TD colSpan=2><IMG height=1 src="images/blank.gif" width=1></TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD width=2 rowSpan=3><IMG height=1 src="images\blank(1).gif"
						width=2></TD>
					<TD width="2">
						<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
							<TBODY>
								<TR>
									<TD height=25>&nbsp;您现在的位置：新增用户</TD>
								</TR>
								<TR>
									<TD bgColor=#2650a6><IMG height=1
										src="images\blank(1).gif" width=1></TD>
								</TR>
								<TR>
									<TD><IMG height=2 src="images\blank(1).gif" width=574></TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
				</TR>
				<TR vAlign=top>
					<TD height="600" bgColor=#f1f3f9>

						<form method="POST" action="addUser.do">
						<div>
						
								手机号码：<input type="text" id="txt_search" name="mobile_Number" size="20">
							
							<div id="searchresult" style="display: none;">
  </div>
 </div>
							<p>
								漫游状态：<input type="radio" name="roaming_Status" value="L" checked>省内漫游
								<input type="radio" name="roaming_Status" value="D">国内漫游
								<input type="radio" name="roaming_Status" value="I">国际漫游
							</p>
							<p>
								通话级别：<input type="radio" value="L" checked name="com_Level">本地通话
								<input type="radio" name="com_Level" value="D">国内长途 <input
									type="radio" name="com_Level" value="I">国际长途
							</p>
							<p>
								客户ID：<input type="text" name="T2" size="20" readonly="readonly">
							</p>

							<p>
								<input type="submit" value="完成>>" name="B1"><input
									type="reset" value="全部重写" name="B2">
							</p>
						</form>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		<BR>
	</CENTER>
</BODY>
</HTML>
