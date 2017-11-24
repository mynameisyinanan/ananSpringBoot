<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:forEach items="${content}" var="con">
		<tr id="loin">
			<th scope="row">${con.id}</th>
			<td><A href='${frontPath}/content/${con.id}' target="_blank">${con.title}</A></td>
			<td>${con.createTime}</td>
			<td>
				<input type="radio" name="stasic${con.id}" value="1" checked="checked">1  <font color="red">未选中</font>				
			</td>
			<td>${con.loves}</td>
			<td>${con.username}</td>
		</tr>
	</c:forEach>