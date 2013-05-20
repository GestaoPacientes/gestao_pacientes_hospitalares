package br.edu.fei.gestaopacienteslogic.logic;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOFactory;
import br.com.lett.guteDAO.DAOResult;
import br.com.lett.guteDAO.DataAccessObject;
import br.edu.fei.gestaopacienteslogic.bean.ConsideracoesMedicas;
import br.edu.fei.gestaopacienteslogic.bean.Diagnostico;
import br.edu.fei.gestaopacienteslogic.bean.Medicamento;
import br.edu.fei.gestaopacienteslogic.bean.Paciente;
import br.edu.fei.gestaopacienteslogic.bean.Pessoa;
import br.edu.fei.gestaopacienteslogic.enums.TipoSanguineo;

/**
 * Classe encarregada de realizar todas operações logicas que envolvem o
 * Paciente.
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class PacienteLogic {
	
	MedicamentoLogic medicamentosLogic = new MedicamentoLogic();
	ConsideracoesMedicasLogic considMedLogic = new ConsideracoesMedicasLogic();
	MedicoLogic medicoLogic = new MedicoLogic();
	DiagnosticoLogic diagLogic = new DiagnosticoLogic();
	/** Logger da classe */
	static Logger logger = LogManager.getLogger(PacienteLogic.class.getName());
	
	/**
	 * Obtem um determinado paciente do banco dado seu ID
	 * @param idPaciente ID do paciente
	 * @return Paciente objeto paciente construido
	 */
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
	
	/**
	 * Constroi um objeto paciente dado o resultset do banco
	 * @param rs ResultSet com os dados do paciente
	 * @return Objeto paciente construido
	 * @throws DAOException Qualquer excecao de banco de dados ocorrida
	 * durante o processo.
	 */
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
	
	/**
	 * Obtem a lista de medicamentos de um determinado paciente;
	 * @param idPaciente ID do paciente
	 * @return ArrayList[Medicamento] ArrayList portando todos medicamentos
	 * do paciente recebido.
	 */
	public ArrayList<Medicamento> getMedicamentosAssociados(Integer idPaciente){
		ArrayList<Medicamento> arrMedicamentos = new ArrayList<Medicamento>();
		
		DataAccessObject dao = null;
		try{
			dao = DAOFactory.createDAO();
			DAOResult rs = dao.executeQuery("SELECT MED.ID AS MED_ID,"+
											"  MED.NOME AS MED_NOME,"+
											"  MED.EMPRESA AS MED_EMPRESA,"+
											"  MED.COMPOSICAO AS MED_COMPOSICAO,"+
											"  MED.QTDE AS MED_QTDE,"+
											"  MED.MODO_USO AS MED_MODO_USO,"+
											"  MED.CONTRA_INDICACOES AS MED_CONTRA_INDICACOES "+
											"FROM MEDICAMENTOS MED "+
											"INNER JOIN PACIENTE_MEDICAMENTO PAC_MED "+
											"ON MED.ID                 = PAC_MED.ID_MEDICAMENTO "+
											"WHERE PAC_MED.ID_PACIENTE = "+idPaciente);
			
			while(rs.next()){
				arrMedicamentos.add(medicamentosLogic.buildMedicamento(rs,"MED_"));
			}
		
		}catch(DAOException e){
			logger.error("Erro ao tentar obter paciente do banco:"+e,e);
		}finally{
			if(dao!=null) dao.closeDao();
		}
		
		return arrMedicamentos;
	}
	
	/**
	 * Obtem uma lista de ConsideracoesMedicas dado determinado paciente
	 * @param idPaciente ID do paciente
	 * @return ArrayList[ConsideracoesMedicas] Lista de consideracoes medicas do paciente
	 */
	public ArrayList<ConsideracoesMedicas> getConsideracoesMedicas(Integer idPaciente){
		ArrayList<ConsideracoesMedicas> arrConsid = new ArrayList<ConsideracoesMedicas>();
		
		DataAccessObject dao = null;
		try{
			dao = DAOFactory.createDAO();
			DAOResult rs = dao.executeQuery("SELECT CON_MED.DESCRICAO CON_MED_DESCRICAO,"+
					"  CON_MED.LOG_DATA CON_MED_LOG_DATA,      "+
					"  MED.ID MED_ID,                          "+
					"  MED.NOME MED_NOME,                      "+
					"  MED.TIPO_USUARIO MED_TIPO_USUARIO,      "+
					"  MED.DATA_NASCIMENTO MED_DATA_NASCIMENTO,"+
					"  MED.CPF MED_CPF,                        "+
					"  MED.RG MED_RG,                          "+
					"  MED.TELEFONE MED_TELEFONE               "+
					"FROM CONSIDERACOES_MEDICAS CON_MED "+
					"INNER JOIN USUARIOS MED           "+
					"ON CON_MED.ID_MEDICO = MED.ID     "+
					"WHERE ID_PACIENTE    = "+idPaciente);
			
			while(rs.next()){
				ConsideracoesMedicas considAux = considMedLogic.buildConsideracoesMedicas(rs, "CON_MED_");
				considAux.setMedico(medicoLogic.buildMedico(rs,"MED_"));
				arrConsid.add(considAux);
			}
		
		}catch(DAOException e){
			logger.error("Erro ao tentar obter paciente do banco:"+e,e);
		}finally{
			if(dao!=null) dao.closeDao();
		}
		
		return arrConsid;
	}

	/**
	 * Obtem uma lista de Diagnosticos dado determinado paciente
	 * @param idPaciente ID do paciente
	 * @return ArrayList[Diagnostico] Lista de diagnosticos do paciente
	 */
	public ArrayList<Diagnostico> getDiagnosticos(Integer idPaciente){
		ArrayList<Diagnostico> arrDiag = new ArrayList<Diagnostico>();
		
		DataAccessObject dao = null;
		
		try{
			dao = DAOFactory.createDAO();
			DAOResult rs = dao.executeQuery("SELECT ENFERMIDADE "+
					"FROM DIAGNOSTICOS "+
					"WHERE ID_PACIENTE    = "+idPaciente);
			
			while(rs.next()){
				Diagnostico considAux = diagLogic.buildDiagnostico(rs);
				arrDiag.add(considAux);
			}
		
		}catch(DAOException e){
			logger.error("Erro ao tentar obter paciente do banco:"+e,e);
		}finally{
			if(dao!=null) dao.closeDao();
		}
		
		return arrDiag;
		
	}
	
}
