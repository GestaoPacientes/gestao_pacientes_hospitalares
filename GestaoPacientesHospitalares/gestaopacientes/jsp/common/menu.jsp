<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>

<div id="menu_container">

<div class="botao" id="btnPaciente" style="width:120px;" onclick="redirectTo('Paciente.do');">
	<div class="corpo_botao" style="color:#006ef7;">
		Paciente
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="background-color:#006ef7;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnMedicamentos" style="width:210px;" onclick="redirectTo('Medicamentos.do');">
	<div class="corpo_botao" style="color:#f26667;">
		Medicamentos
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="background-color:#f26667;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnDiagnostico" style="width:170px;" onclick="redirectTo('Diagnostico.do');">
	<div class="corpo_botao" style="color:#660DDB;">
		Diagnosticos
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="background-color:#660DDB;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnConsideracoes" style="width:300px;" onclick="redirectTo('Consideracoes.do');">
	<div class="corpo_botao" style="color:#dde000;">
		Considerações Médicas
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="background-color:#dde000;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnSair" style="width:100px;" onclick="redirectTo('Index.do?LOGOUT_ATTEMPT=true');">
	<div class="corpo_botao" style="color:#66cc66;">
		Sair
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="background-color:#66cc66;"></div>
	</div>
</div>


</div>

<script>

$(".botao").hover(
	  function () {
		  $("#"+$(this).attr("id")+" .faixa_botao .nao_selecionado").height(10);
	  },
	  function () {
		  $("#"+$(this).attr("id")+" .faixa_botao .nao_selecionado").height(3);
	  }
	);

<c:if test="${not empty pagina}">
	$("#btn${pagina} .faixa_botao .nao_selecionado").height(10);
	$("#btn${pagina}").unbind('mouseenter mouseleave');

</c:if>

</script>
