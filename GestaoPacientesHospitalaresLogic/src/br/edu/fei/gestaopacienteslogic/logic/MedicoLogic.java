package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.Medico;
import br.edu.fei.gestaopacienteslogic.enums.Cargo;

public class MedicoLogic {
	
	public Medico buildMedico(DAOResult dr) throws DAOException{
		return buildMedico(dr, "");
	}
	
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
