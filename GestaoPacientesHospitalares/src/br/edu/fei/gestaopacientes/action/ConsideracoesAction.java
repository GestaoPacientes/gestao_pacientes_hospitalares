package br.edu.fei.gestaopacientes.action;

import java.util.ArrayList;

import br.edu.fei.gestaopacienteslogic.bean.ConsideracoesMedicas;
import br.edu.fei.gestaopacienteslogic.logic.PacienteLogic;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe responsável por realizar o processamento do Login do usuário
 * @author Gabriel Lett Viviani
 *
 */
public class ConsideracoesAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	private String pagina = "Consideracoes";
	private String paginaPresent = "Considerações Médicas";
	private PacienteLogic pacLogic = new PacienteLogic();
	
	public String getPagina(){
		return this.pagina;
	}

	public String getPaginaPresent(){
		return this.paginaPresent;
	}
	
	public ArrayList<ConsideracoesMedicas> consideracoesMedicas;
	
	public String execute(){
		
		
		Integer idPaciente = (Integer) ActionContext.getContext().getSession().get("USER_LOGGED");
		this.setConsideracoesMedicas(pacLogic.getConsideracoesMedicas(idPaciente));

		return "success";
	}

	/**
	 * @return the consideracoesMedicas
	 */
	public ArrayList<ConsideracoesMedicas> getConsideracoesMedicas() {
		return consideracoesMedicas;
	}

	/**
	 * @param consideracoesMedicas the consideracoesMedicas to set
	 */
	public void setConsideracoesMedicas(
			ArrayList<ConsideracoesMedicas> consideracoesMedicas) {
		this.consideracoesMedicas = consideracoesMedicas;
	}

}
