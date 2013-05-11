package br.edu.fei.gestaopacienteslogic.bean;

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
	private String filiacao;
	
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
	 * @return the filiacao
	 */
	public String getFiliacao() {
		return filiacao;
	}
	/**
	 * @param filiacao the filiacao to set
	 */
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
}
