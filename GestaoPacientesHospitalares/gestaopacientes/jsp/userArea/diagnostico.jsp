<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="bodyPage" >
	<div id="innerBodyContainer" >
		<table id="rounded-corner">
			<thead>
				<tr>
					<th style="width:600px">Diagnostico</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="diagnostico" items="${diagnosticos}">
					<tr>
						<td>${diagnostico.enfermidade}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>