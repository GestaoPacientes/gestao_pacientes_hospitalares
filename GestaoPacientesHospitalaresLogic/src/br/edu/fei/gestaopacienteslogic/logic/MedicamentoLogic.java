package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.Medicamento;

public class MedicamentoLogic {

	public Medicamento buildMedicamento (DAOResult dr) throws DAOException{
		return this.buildMedicamento(dr, "");
	}
	public Medicamento buildMedicamento (DAOResult dr, String prefixoTabela) throws DAOException{
		
		Medicamento medicamento = new Medicamento();
		medicamento.setID(dr.getInt(prefixoTabela+"ID"));
		medicamento.setNome(dr.getString(prefixoTabela+"NOME"));
		medicamento.setEmpresa(dr.getString(prefixoTabela+"EMPRESA"));
		medicamento.setComposicao(dr.getString(prefixoTabela+"COMPOSICAO"));
		medicamento.setQuantidade(dr.getInt(prefixoTabela+"QTDE"));
		medicamento.setModoUso(dr.getString(prefixoTabela+"MODO_USO"));
		medicamento.setContraIndicacoes(dr.getString(prefixoTabela+"CONTRA_INDICACOES"));
		
		return medicamento;
	}
}
