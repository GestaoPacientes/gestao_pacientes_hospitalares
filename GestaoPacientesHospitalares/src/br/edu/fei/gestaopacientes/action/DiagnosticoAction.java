package br.edu.fei.gestaopacientes.action;

import java.util.ArrayList;

import br.edu.fei.gestaopacienteslogic.bean.Diagnostico;
import br.edu.fei.gestaopacienteslogic.logic.PacienteLogic;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe responsável por realizar o processamento do Login do usuário
 * @author Gabriel Lett Viviani
 *
 */
public class DiagnosticoAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	private String pagina = "Diagnostico";
	private String paginaPresent = "Diagnostico";
	private PacienteLogic pacLogic = new PacienteLogic();

	private ArrayList<Diagnostico> diagnosticos= new ArrayList<Diagnostico>();
	
	public String getPagina(){
		return this.pagina;
	}

	public String getPaginaPresent(){
		return this.paginaPresent;
	}
	
	public String execute(){
		Integer idPaciente = (Integer) ActionContext.getContext().getSession().get("USER_LOGGED");
		this.setDiagnosticos(pacLogic.getDiagnosticos(idPaciente));
		
		return "success";
	}

	/**
	 * @return the diagnosticos
	 */
	public ArrayList<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	/**
	 * @param diagnosticos the diagnosticos to set
	 */
	public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

}
