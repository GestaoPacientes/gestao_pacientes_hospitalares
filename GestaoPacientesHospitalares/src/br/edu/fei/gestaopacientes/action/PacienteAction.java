package br.edu.fei.gestaopacientes.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.edu.fei.gestaopacienteslogic.bean.Paciente;

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
	
	public String execute() throws ParseException{
		Paciente lett = new Paciente();
		lett.setNome("Americo Juvencio");
		lett.setCPF("111.444.777-35");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		lett.setDataNascimento(sdf.parse("06/10/1917"));
		lett.setFiliacao("Américo Pai e Maria Lucia de Cisplatina");
		lett.setRG("10.102.102-1");
		
		return "success";
	}
	
	public Paciente getPaciente(){
		return this.paciente;
	}

}
