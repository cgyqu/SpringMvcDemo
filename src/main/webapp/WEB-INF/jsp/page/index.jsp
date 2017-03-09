<%--
  Created by IntelliJ IDEA.
  User: cgy6094
  Date: 2017/3/3
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@page isELIgnored="false" %>--%>
<html>
<head>
    <title>test</title>
</head>
<br>
<h1>This is Page Index</h1>
</br>
当前时间: <span>${time}</span>
</br>
<label>id:</label><span>${model.id}</span>
<label>name:</label><span>${model.name}</span>
<input type="button" id="test" value="test"/>
</body>
</html>
<script type="text/javascript" src="${contextPath}/JS/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
    $("#test").click(function () {
        alert("this is from jquery function")
    })
</script>
