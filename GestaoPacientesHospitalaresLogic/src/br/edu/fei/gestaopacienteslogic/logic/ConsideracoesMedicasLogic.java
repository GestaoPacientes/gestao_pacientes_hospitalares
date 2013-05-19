package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.ConsideracoesMedicas;

public class ConsideracoesMedicasLogic {
	public ConsideracoesMedicas buildConsideracoesMedicas(DAOResult dr) throws DAOException{
		return buildConsideracoesMedicas(dr, "");
	}
	
	public ConsideracoesMedicas buildConsideracoesMedicas(DAOResult dr, String prefixo) throws DAOException{
		
		ConsideracoesMedicas medico = new ConsideracoesMedicas();

		medico.setDescricao(dr.getString(prefixo+"DESCRICAO"));
		medico.setData(dr.getDate(prefixo+"LOG_DATA"));
		
		return medico;
	}
}
