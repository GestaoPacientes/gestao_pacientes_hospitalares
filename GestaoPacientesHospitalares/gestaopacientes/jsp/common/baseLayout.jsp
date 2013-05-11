<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<title>
			<tiles:insertAttribute name="title" ignore="true" />
		</title>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<link rel="stylesheet" href="css/geral.css" />
		  
		<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
		
		<script>
			function redirectTo(url){
				window.location=url;
			}
			
		</script>
	</head>
	<body>
		<div class="header">
			<tiles:insertAttribute name="header" />
		</div>
		
		<div class="h-separator"></div>
		<br/>
		<div class="menu">
			<tiles:insertAttribute name="menu" />
		</div>

		<div class="content">
		
			<tiles:insertAttribute name="body" />
		</div>
		
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</body>
</html>

