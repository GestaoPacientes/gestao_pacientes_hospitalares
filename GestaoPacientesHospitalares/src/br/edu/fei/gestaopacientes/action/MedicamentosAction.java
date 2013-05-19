package br.edu.fei.gestaopacientes.action;

import java.util.ArrayList;

import br.edu.fei.gestaopacienteslogic.bean.Medicamento;
import br.edu.fei.gestaopacienteslogic.logic.PacienteLogic;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * Classe responsável por realizar o processamento do Login do usuário
 * @author Gabriel Lett Viviani
 *
 */
public class MedicamentosAction extends ActionSupport{
	/** Serial */
	private static final long serialVersionUID = -7943571654911514364L;
	
	private ArrayList<Medicamento> medicamentos= new ArrayList<Medicamento>();
	private PacienteLogic pacLogic = new PacienteLogic();
	
	private String pagina = "Medicamentos";
	private String paginaPresent = "Medicamentos";
	
	public String execute(){
		Integer idPaciente = (Integer) ActionContext.getContext().getSession().get("USER_LOGGED");
		this.setMedicamentos(pacLogic.getMedicamentosAssociados(idPaciente));
		
		return "success";
	}
	
	public String getPagina(){
		return this.pagina;
	}

	public String getPaginaPresent(){
		return this.paginaPresent;
	}

	/**
	 * @return the medicamentos
	 */
	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	/**
	 * @param medicamentos the medicamentos to set
	 */
	public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
}
