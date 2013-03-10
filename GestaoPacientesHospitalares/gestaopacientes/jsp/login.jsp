<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<%--

Basicamente a coisa funciona assim, definimos na web.xml que esta é a pagina chamada ao abrir o sistema.
Quando alguem clica nos botões de login, eles chamam o link "Login.action". Esse link, com tem o sufixo 
"action" é enviado ao Struts2, que procura pelo mapeamento da palavra "Login" (atenção, é case sensitive)
no struts.xml. Vá a struts.xml para mais info do que ocorre


 --%>
<head>

<style type="text/css">
/* Aqui fica armazenado o Estilo da pagina, ou seja, todas formatações de cores, centralizações 
 * ficam aqui.
 * Neste caso, declarei dentro da JSP para testes, mas o que se faz com frequencia é criar um 
 * arquivo .css que é importado em todas paginas, centralizando as alterações de estilo em um único 
 * arquivo :D
 * 
 * O # antes de errors indica que eu estou obtendo alguma coisa pelo seu ID, ou seja, estou falando 
 * que o(s) elemento(s) com o ID "errors" terá a cor de text FF0000 (vermelho).
 */
#errors{
	color:#FF0000;
}
</style>

<title> Teste de Login</title>
</head>

<body>
<h1>Gestão de Pacientes</h1>

<%-- Exibe os erros trazidos pela action, caso existam --%>
<div id=errors><s:actionerror /></div>

<%-- Aqui o form é montado inteiramente pelo Struts2 --%>
<s:form action="Login.action" method="post">
	<%-- Campos da Struts, a key é o nome que aparece na frente --%>
	<s:textfield name="login" key="Login" size="20" /><br/>
	<s:password name="senha" key="Senha" size="20" /><br/>
	<s:submit method="execute" value="Logar" align="center" /><br/>
</s:form>


<br/>
Agora o mesmo formulário, usando um HTML mais puro:


<form id="formLogin" action="Login.action" method="post">
	Login: <input type="text" name="login"/><br/>
	Senha: <input type="password" name="senha"/><br/>
	<input type="submit" value="Logar"/><br/>
	<br/>
	Este botão abaixo usa JavaScript para enviar o formulário!<br/>
	<input type="button" value="Logar" onclick="enviaForm();"/>
</form>
</body>

<script>

function enviaForm(){
	// Obtem um elemento da pagina (document) pelo seu ID (getElementById) e chama
	// o método submit
	document.getElementById("formLogin").submit();
}

</script>
mobral

</html>

