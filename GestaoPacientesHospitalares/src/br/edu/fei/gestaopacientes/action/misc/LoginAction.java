package br.edu.fei.gestaopacientes.action.misc;

import java.sql.ResultSet;

import br.com.lett.guteDAO.DAOException;
import br.com.lett.guteDAO.DAOFactory;
import br.com.lett.guteDAO.DataAccessObject;
import br.edu.fei.gestaopacienteslogic.logic.AcessoLogic;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe responsável por realizar o processamento do Login do usuário
 * @author Gabriel Lett Viviani
 *
 */
public class LoginAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	/** Field Login do JSP */
	private String login;
	
	/** Field senha do JSP */
	private String senha;

	/**
	 * Metodo padrão chamado por toda action caso não seja definido no struts.xml 
	 * @throws DAOException 
	 */
	public String execute() throws Exception {

		// As propriedades já vem preenchidas com seu respectivo nome da tela, e 
		// aqui podemos obtelas normalmente
		//DataAccessObject dao = DAOFactory.createDAO();
		
		//ResultSet rs = dao.executeQuery("SELECT 1 FROM USUARIOS WHERE LOGIN = '"+this.getLogin()+"' AND SENHA = '"+this.getSenha()+"';");
		
		/*if(rs.next()){
			//logado
		}else{
			//nao logado
		}*/
		
		if (this.login.equals("fei") && this.senha.equals("123")) {
			return "success";
		} else {
			addActionError("Login Invalido!");
			return "login_invalido";
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
