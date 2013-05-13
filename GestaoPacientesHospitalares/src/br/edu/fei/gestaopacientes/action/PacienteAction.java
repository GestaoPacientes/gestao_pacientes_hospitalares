package br.edu.fei.gestaopacientes.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.edu.fei.gestaopacienteslogic.bean.Paciente;
import br.edu.fei.gestaopacienteslogic.enums.Sexo;
import br.edu.fei.gestaopacienteslogic.enums.TipoSanguineo;

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
	
	public String getPagina(){
		return this.pagina;
	}

	public String getPaginaPresent(){
		return this.paginaPresent;
	}
	
	public String execute() throws ParseException{
		
		return "success";
	}
	
	public Paciente getPaciente() {
		
		Paciente pacTest = new Paciente();
		try{
			pacTest.setNome("Americo Juvencio");
			pacTest.setCPF("111.444.777-35");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			pacTest.setDataNascimento(sdf.parse("06/10/1917"));
			pacTest.setFiliacao("Américo Pai e Maria Lucia de Cisplatina");
			pacTest.setRG("10.102.102-1");
			pacTest.setTipoSanguineo(TipoSanguineo.Op);
			pacTest.setSexo(Sexo.MASCULINO);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		this.paciente = pacTest;
		return this.paciente;
	}

	
}
