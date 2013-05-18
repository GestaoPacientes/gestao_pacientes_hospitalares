package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.Medicamento;

public class MedicamentoLogic {

	public Medicamento buildMedicamento (DAOResult dr) throws DAOException{
		
		Medicamento medicamento = new Medicamento();
		medicamento.setID(dr.getInt("ID"));
		medicamento.setNome(dr.getString("NOME"));
		medicamento.setEmpresa(dr.getString("EMPRESA"));
		medicamento.setComposicao(dr.getString("COMPOSICAO"));
		medicamento.setQuantidade(dr.getInt("QTDE"));
		medicamento.setModoUso(dr.getString("MODO_USO"));
		medicamento.setContraIndicacoes(dr.getString("CONTRA_INDICACOES"));
		
		return medicamento;
	}
}
