package br.edu.fei.gestaopacienteslogic.enums;

/**
 * Representa o sexos de uma pessoa
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public enum Sexo {
	MASCULINO("Masculino","M"),
	FEMININO("Feminino","F");
	
	/** Descrição para apresentação na página */
	private String descricao;
	
	/** Abreviação para obtenção do banco */
	private String abreviacao;
	
	private Sexo(String descricao, String abreviacao){
		this.descricao = descricao;
		this.abreviacao = abreviacao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the abreviacao
	 */
	public String getAbreviacao() {
		return abreviacao;
	}

	/**
	 * @param abreviacao the abreviacao to set
	 */
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
}
