package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.Medicamento;

/**
 * Classe encarregada de realizar as operações logicas com os
 * medicamentos
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class MedicamentoLogic {
	
	/**
	 * Monta o bean de consideracoes medicas a partir
	 * de um result sem prefixo nas colunas
	 * @param dr DAOResult
	 * @return Medicamento medicamento 
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
	public Medicamento buildMedicamento (DAOResult dr) throws DAOException{
		return this.buildMedicamento(dr, "");
	}
	
	/**
	 * Constroi o medicamento a partir de um 
	 * DAOResult com prefixo
	 * @param dr DAOResult
	 * @param prefixo Prefixo da coluna
	 * @return Medicamento  medicamento montado
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
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
