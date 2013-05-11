package br.edu.fei.gestaopacienteslogic.enums;

public enum TipoSanguineo {
	Op(true, "O+", "O Positivo"),
	On(true, "O-", "O Negativo"),
	Ap(true, "A+", "A Positivo"),
	An(true, "A-", "A Negativo"),
	Bp(true, "B+", "B Positivo"),
	Bn(true, "B-", "B Negativo"),
	ABp(true, "AB+", "AB Positivo"),
	ABn(true, "AB-", "AB Negativo");

	/** Indica o RH do tipo sanguineo, true indica positivo */
	private boolean rh;
	
	/** Descrição completa do tipo */
	private String descicao;
	
	/** Abreviacao do tipo */
	private String abreviacao;
	
	private TipoSanguineo(boolean rh,String abreviacao, String descricao){
		this.rh = rh;
		this.descicao = descricao;
		
	}

	/**
	 * @return the rh
	 */
	public boolean isRh() {
		return rh;
	}

	/**
	 * @param rh the rh to set
	 */
	public void setRh(boolean rh) {
		this.rh = rh;
	}

	/**
	 * @return the descicao
	 */
	public String getDescicao() {
		return descicao;
	}

	/**
	 * @param descicao the descicao to set
	 */
	public void setDescicao(String descicao) {
		this.descicao = descicao;
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
