package br.edu.fei.gestaopacienteslogic.logic;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOFactory;
import br.com.lett.guteDAO.DAOResult;
import br.com.lett.guteDAO.DataAccessObject;
import br.edu.fei.gestaopacienteslogic.bean.Medicamento;
import br.edu.fei.gestaopacienteslogic.bean.Paciente;
import br.edu.fei.gestaopacienteslogic.bean.Pessoa;
import br.edu.fei.gestaopacienteslogic.enums.TipoSanguineo;

public class PacienteLogic {

	static Logger logger = LogManager.getLogger(AcessoLogic.class.getName());
	
	public Paciente getPaciente(Integer idPaciente){
		
		DataAccessObject dao = null;
		try{
			dao = DAOFactory.createDAO();
			DAOResult rs = dao.executeQuery("SELECT ID," +
					"NOME," +
					"DATA_INTERNACAO," +
					"CPF,RG," +
					"DATA_NASCIMENTO," +
					"ALTURA,PESO," +
					"TIPO_SANGUINEO," +
					"ALERGIA,TELEFONE," +
					"NOME_RESPONSAVEL," +
					"QUARTO FROM PACIENTE WHERE ID = "+idPaciente);
			
			rs.next();
			
			return this.buildPaciente(rs);
		}catch(DAOException e){
			logger.error("Erro ao tentar obter paciente do banco:"+e,e);
		}finally{
			if(dao!=null) dao.closeDao();
		}
		
		return null;
	}
	
	private Paciente buildPaciente(DAOResult rs) throws DAOException{
		
		Paciente paciente = new Paciente();

		paciente.setNome(rs.getString("NOME"));
		paciente.setDataInternacao(rs.getDate("DATA_INTERNACAO"));
		paciente.setCPF(rs.getString("CPF"));
		paciente.setRG(rs.getString("RG"));
		paciente.setDataNascimento(rs.getDate("DATA_NASCIMENTO"));
		paciente.setAltura(rs.getDouble("ALTURA"));
		paciente.setPeso(rs.getDouble("PESO"));

		paciente.setTipoSanguineo(TipoSanguineo.parse(rs.getString("TIPO_SANGUINEO")));   
		paciente.setAlergia(rs.getString("ALERGIA"));          
		paciente.setTelefone(rs.getString("TELEFONE"));          
		Pessoa responsavel = new Pessoa();
		responsavel.setNome(rs.getString("NOME_RESPONSAVEL"));
		paciente.setReponsavel(responsavel);        
		paciente.setQuarto(rs.getString("QUARTO"));          
		
		
		return paciente;
		
	}
	
	public ArrayList<Medicamento> getMedicamentosAssociados(Integer idPaciente){
		
	}
}
