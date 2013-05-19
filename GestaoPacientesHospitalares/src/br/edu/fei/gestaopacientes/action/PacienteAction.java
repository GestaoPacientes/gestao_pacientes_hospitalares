package br.edu.fei.gestaopacientes.action;

import br.edu.fei.gestaopacienteslogic.bean.Paciente;
import br.edu.fei.gestaopacienteslogic.logic.PacienteLogic;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe responsável por realizar o processamento do Login do usuário
 * @author Gabriel Lett Viviani
 *
 */
public class PacienteAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	private Paciente paciente;

	private String pagina = "Paciente";
	private String paginaPresent = "Paciente";
	private PacienteLogic logicPaciente = new PacienteLogic();
	
	public String getPagina(){
		return this.pagina;
	}

	public String getPaginaPresent(){
		return this.paginaPresent;
	}
	
	public String execute(){
		Integer idPaciente = (Integer) ActionContext.getContext().getSession().get("USER_LOGGED");
		this.setPaciente(logicPaciente.getPaciente(idPaciente));
		
		return "success";
	}
	
	public Paciente getPaciente() {
		
		return this.paciente;
	}
	
	private void setPaciente(Paciente paciente){
		this.paciente = paciente;
	}

	
}
