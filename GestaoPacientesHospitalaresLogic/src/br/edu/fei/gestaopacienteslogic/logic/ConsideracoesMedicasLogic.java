package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.ConsideracoesMedicas;

/**
 * Classe encarregada de realizar as operações logicas com as 
 * consideracoes medicas
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class ConsideracoesMedicasLogic {
	
	/**
	 * Monta o bean de consideracoes medicas a partir
	 * de um result sem prefixo nas colunas
	 * @param dr DAOResult
	 * @return ConsideracoesMedicas consideracoes
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
	public ConsideracoesMedicas buildConsideracoesMedicas(DAOResult dr) throws DAOException{
		return buildConsideracoesMedicas(dr, "");
	}
	
	/**
	 * Constroi as consideracoes medicas a partir de um 
	 * DAOResult com prefixo
	 * @param dr DAOResult
	 * @param prefixo Prefixo da coluna
	 * @return Consideracoes medicas montado
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
	public ConsideracoesMedicas buildConsideracoesMedicas(DAOResult dr, String prefixo) throws DAOException{
		
		ConsideracoesMedicas medico = new ConsideracoesMedicas();

		medico.setDescricao(dr.getString(prefixo+"DESCRICAO"));
		medico.setData(dr.getDate(prefixo+"LOG_DATA"));
		
		return medico;
	}
}
