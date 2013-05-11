<div id="menu_container" style="margin: 0 auto; width:1190px; ">

<div class="botao" id="btnAcesso" style="width:150px;">
	<div class="corpo_botao" style="color:#66cc66;">
		Acesso
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="height:3px; background-color:#66cc66;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnPacientes" style="width:170px;">
	<div class="corpo_botao" style="color:#006ef7;">
		Pacientes
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="height:3px; background-color:#006ef7;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnMedicamentos" style="width:260px;">
	<div class="corpo_botao" style="color:#f26667;">
		Medicamentos
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="height:3px; background-color:#f26667;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnDiagnosticos" style="width:220px;">
	<div class="corpo_botao" style="color:#660DDB;">
		Diagnosticos
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="height:3px; background-color:#660DDB;"></div>
	</div>
</div>

<div class="separator"></div>

<div class="botao" id="btnConsidMedicas" style="width:350px;" onclick="hoverBtn(this.id)">
	<div class="corpo_botao" style="color:#dde000;">
		Considerações Médicas
	</div>
	<div class="faixa_botao" style="">
		<div class="nao_selecionado" style="height:3px; background-color:#dde000;"></div>
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

</script>
