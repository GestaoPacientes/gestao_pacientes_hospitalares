package br.edu.fei.gestaopacienteslogic.bean;

import java.util.Date;

import br.edu.fei.gestaopacienteslogic.enums.TipoSanguineo;

/**
 * Classe utilizada para representar um paciente dentro do sistema
 * @author Gabriel Lett Viviani
 *
 */
public class Paciente extends Pessoa{
	
	/** Tipo sanguineo do paciente */
	private TipoSanguineo tipoSanguineo;
	
	/** Filiação do paciente, campo livre podendo ser somente pai, somente mãe ou ambos */
	private Pessoa reponsavel;
	
	/** Data de internação do paciente */
	private Date dataInternacao;
	
	/** Altura do paciente */
	private Double altura;
	
	/** Peso do paciente */
	private Double peso;
	
	/** Alergias do paciente */
	private String alergia;
	
	/** Médico do paciente */
	private Medico medico;
	
	/** Quarto do paciente */
	private String quarto;
	
	/**
	 * @return the tipoSanguineo
	 */
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}
	/**
	 * @param tipoSanguineo the tipoSanguineo to set
	 */
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	/**
	 * @param filiacao the filiacao to set
	 */
	public void setReponsavel(Pessoa reponsavel) {
		this.reponsavel = reponsavel;
	}
	/**
	 * @return the dataInternacao
	 */
	public Date getDataInternacao() {
		return dataInternacao;
	}
	/**
	 * @param dataInternacao the dataInternacao to set
	 */
	public void setDataInternacao(Date dataInternacao) {
		this.dataInternacao = dataInternacao;
	}
	/**
	 * @return the altura
	 */
	public Double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	/**
	 * @return the alergia
	 */
	public String getAlergia() {
		return alergia;
	}
	/**
	 * @param alergia the alergia to set
	 */
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	/**
	 * @return the medico
	 */
	public Medico getMedico() {
		return medico;
	}
	/**
	 * @param medico the medico to set
	 */
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	/**
	 * @return the quarto
	 */
	public String getQuarto() {
		return quarto;
	}
	/**
	 * @param quarto the quarto to set
	 */
	public void setQuarto(String quarto) {
		this.quarto = quarto;
	}
	/**
	 * @return the reponsavel
	 */
	public Pessoa getReponsavel() {
		return reponsavel;
	}
}
