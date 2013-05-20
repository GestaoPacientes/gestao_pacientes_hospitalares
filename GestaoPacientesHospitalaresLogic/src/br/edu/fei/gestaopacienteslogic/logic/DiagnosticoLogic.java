package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.Diagnostico;

/**
 * Classe encarregada de realizar as operações logicas com os 
 * diagnosticos
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class DiagnosticoLogic {
	
	/**
	 * Monta o bean de diagnosticos a partir
	 * de um result sem prefixo nas colunas
	 * @param dr DAOResult
	 * @return Diagnostico diagnostico
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
	public Diagnostico buildDiagnostico(DAOResult dr) throws DAOException{
		return buildDiagnostico(dr, "");
	}
	
	/**
	 * Constroi o diagnostico a partir de um 
	 * DAOResult com prefixo
	 * @param dr DAOResult
	 * @param prefixo Prefixo da coluna
	 * @return Diagnostico montado
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
	public Diagnostico buildDiagnostico(DAOResult dr, String prefixoTabela) throws DAOException{
		Diagnostico diag = new Diagnostico();
		
		diag.setEnfermidade(dr.getString(prefixoTabela+"ENFERMIDADE"));
		
		return diag;
	}
}
