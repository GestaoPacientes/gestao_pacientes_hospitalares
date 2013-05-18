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
	
	public static TipoSanguineo parse(String sigla){
		if("O+".equals(sigla)){
			return TipoSanguineo.Op;
		}else if("O-".equals(sigla)){
			return TipoSanguineo.On;
		}else if("A+".equals(sigla)){
			return TipoSanguineo.Ap;
		}else if("A-".equals(sigla)){
			return TipoSanguineo.An;
		}else if("B+".equals(sigla)){
			return TipoSanguineo.Bp;
		}else if("B-".equals(sigla)){
			return TipoSanguineo.Bn;
		}else if("AB+".equals(sigla)){
			return TipoSanguineo.ABp;
		}else if("AB-".equals(sigla)){
	    	return TipoSanguineo.ABn;
	    }
		
		return null;
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
