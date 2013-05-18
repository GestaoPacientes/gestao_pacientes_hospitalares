<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="bodyPage" >
<div id="innerBodyContainer" >
	<span style="font-size:20pt; color:#000000;">${paciente.nome}</span><br/>
	<div class="separador" ></div>
	<div style="height:5px;" ></div>
	<span class="attrTitle" >Tipo sanguíneo: </span>${paciente.tipoSanguineo.descicao}<br/>
	<span class="attrTitle">Data de Interna&ccedil;&atilde;o: </span>${paciente.dataInternacao}<br/>
	<span class="attrTitle">Altura: </span>${paciente.altura }<br/>
	<span class="attrTitle">Peso: </span>${paciente.peso }<br/>
	<span class="attrTitle">Alergias: </span>${paciente.alergia }<br/>
	<span class="attrTitle">Telefone: </span>${paciente.telefone }<br/>
	<span class="attrTitle">Quarto: </span>${paciente.quarto }<br/>
</div>
</div>