package br.edu.fei.gestaopacienteslogic.logic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOFactory;
import br.com.lett.guteDAO.DAOResult;
import br.com.lett.guteDAO.DataAccessObject;

/**
 * Classe encarregada de tratar da logica do acesso ao sistema 
 * efetuado pelo usuário
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class AcessoLogic {

	/** log4j */
	static Logger logger = LogManager.getLogger(AcessoLogic.class.getName());
	
	/**
	 * Obtem o id do usuário dada uma chave
	 * @param chave Chave digitada
	 * @return Integer id do usuario
	 */
	public Integer loginChave(String chave){
		Integer idPaciente = null;
		DataAccessObject dao = null;
		try{
			dao = DAOFactory.createDAO();
			
			DAOResult rs = dao.executeQuery("SELECT ID FROM PACIENTE WHERE CHAVE = '"+chave+"'");
			

			if (rs != null) {
				while (rs.next()) {
					idPaciente = rs.getInt("ID");
					break;
				}
			}
			
		}catch(DAOException e){
			logger.error("Erro ao tentar obter paciente:"+e.getMessage());
		}finally{
			if(dao!=null) dao.closeDao();
		}
		
		return idPaciente;
	}
}
