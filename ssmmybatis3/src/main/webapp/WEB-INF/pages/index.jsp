<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SprintMvc ！！！</h1>
	<div class="col-md-12">
		<table class="table table-hover">
			<thead>
				<tr>
					<td>编号</td>
					<td>标题</td>
					<td>创建时间</td>
					<td>状态</td>
					<td>点赞数</td>
					<td>用户名</td>
				</tr>
			</thead>
			<!-- 内容显示部分 -->
			<tbody id="tbody">

			</tbody>
		</table>
	</div>
	
	<script type="text/javascript" src="http://localhost:8080/ssmmybatis3/js/jquery-2.1.1.min.js"></script>
	<script>
	$(function(){
		//对于content板块的操作
		mkcontent.init();
	});
	//对于content板块的操作
	var mkcontent ={
		//主方法
		init:function(){
			//查询全部
			mkcontent.list();
		},
		//查询全部
		list:function(){
			//发起请求进入方法
			$.post("http://localhost:8080/ssmmybatis3/list",function(data){
				//通过模板追加到table下面
				$("#tbody").html(data);
			});
		}
	}
	</script>
</body>
</html>