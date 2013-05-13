<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="innerCentraliza">
<label style="color:#FF0000">${loginInvalido}</label>
	<s:form namespace="/" action="Index.do" method="post">
	    <s:hidden name="LOGIN_ATTEMPT" value="%{'1'}" />
	    <s:password name="PASSWORD" label="Senha" />
	    <s:submit value="Acessar" align="center">
	        <s:param name="colspan" value="%{2}" />
	        <s:param name="align" value="%{'center'}" />
	    </s:submit>
	</s:form>
</div>
</body>
</html>