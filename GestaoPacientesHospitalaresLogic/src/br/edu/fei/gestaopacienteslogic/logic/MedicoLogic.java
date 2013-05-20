package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.Medico;
import br.edu.fei.gestaopacienteslogic.enums.Cargo;

/**
 * Classe encarregada de realizar as operações logicas com o
 * medico
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class MedicoLogic {
	
	/**
	 * Monta o bean de medico a partir
	 * de um result sem prefixo nas colunas
	 * @param dr DAOResult
	 * @return Medico medico
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
	public Medico buildMedico(DAOResult dr) throws DAOException{
		return buildMedico(dr, "");
	}
	
	/**
	 * Constroi o medico a partir de um 
	 * DAOResult com prefixo
	 * @param dr DAOResult
	 * @param prefixo Prefixo da coluna
	 * @return medico montado
	 * @throws DAOException Qualquer exception ocorrida durante o processo
	 */
	public Medico buildMedico(DAOResult dr, String prefixo) throws DAOException{
		
		Medico medico = new Medico();

		medico.setID(dr.getInt(prefixo+"ID"));
		medico.setNome(dr.getString(prefixo+"NOME"));
		medico.setDataNascimento(dr.getDate(prefixo+"DATA_NASCIMENTO"));
		medico.setCPF(dr.getString(prefixo+"CPF"));
		medico.setRG(dr.getString(prefixo+"RG"));
		medico.setTelefone(dr.getString(prefixo+"TELEFONE"));
		medico.setCargo(Cargo.MEDICO);
		
		return medico;
	}
}
