package br.edu.fei.gestaopacienteslogic.logic;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOResult;
import br.edu.fei.gestaopacienteslogic.bean.Diagnostico;

public class DiagnosticoLogic {
	
	public Diagnostico buildDiagnostico(DAOResult dr) throws DAOException{
		return buildDiagnostico(dr, "");
	}
	public Diagnostico buildDiagnostico(DAOResult dr, String prefixoTabela) throws DAOException{
		Diagnostico diag = new Diagnostico();
		
		diag.setEnfermidade(dr.getString(prefixoTabela+"ENFERMIDADE"));
		
		return diag;
	}
}
