<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
function(evt) {
							ChangeCoords(); //控制查询结果div坐标
							var k = window.event ? evt.keyCode : evt.which;
							//输入框的id为txt_search，这里监听输入框的keyup事件
							//不为空 && 不为上箭头或下箭头或回车
							if ($("#txt_search").val() != "" && k != 38&& k != 40 && k != 13) {
								$.ajax({
											type : 'Post',
											//async: false, //同步执行，不然会有问题
											dataType : "json",
											url : "addUserMobile.do", //提交的页面/方法名
											data : "{'mobile_Number':'"
													+ $("#txt_search").val()
													+ "'}", //参数（如果没有参数：null）
											contentType : "application/json; charset=utf-8",
											error : function(msg) {//请求失败处理函数
												alert("数据加载失败");
											},
											success : function(data) { //请求成功后处理函数。
												var objData = eval("(" + data.d+ ")");
												if (objData.length > 0) {
													var layer = "";
													layer = "<table id='aa'>";
													$.each(objData,function(idx,item) {
										layer += "<tr class='line'><td class='std'>"+ item.userName+ "</td></tr>";});
													layer += "</table>";
													//将结果添加到div中
													$("#searchresult").empty();
													$("#searchresult").append(layer);
													$(".line:first").addClass("hover");
													$("#searchresult").css("display", "");
													//鼠标移动事件
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
											}
										});
							} else if (k == 38) {//上箭头
								$('#aa tr.hover').prev().addClass("hover");
								$('#aa tr.hover').next().removeClass("hover");
								$('#txt_search').val($('#aa tr.hover').text());
							} else if (k == 40) {//下箭头
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
</body>
</html>