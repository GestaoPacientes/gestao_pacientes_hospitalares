package br.edu.fei.gestaopacienteslogic.bean;

/**
 * Bean dos medicamentos do paciente
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class Medicamento {

	/** Identificador unico na base do medicamento */
	private int ID;
	
	/** Nome do medicamento */
	private String nome;
	
	/** Empresa que fabrica o medicamento */
	private String empresa;
	
	/** Composição do medicamento */
	private String composicao;
	
	/** Quantidade do medicamento */
	private Integer quantidade;
	
	/** Modo de uso do medicamento */
	private String modoUso;
	
	/** Conta indicacoes do medicamento */
	private String contraIndicacoes;

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the composicao
	 */
	public String getComposicao() {
		return composicao;
	}

	/**
	 * @param composicao the composicao to set
	 */
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}

	/**
	 * @return the quantidade
	 */
	public Integer getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the modoUso
	 */
	public String getModoUso() {
		return modoUso;
	}

	/**
	 * @param modoUso the modoUso to set
	 */
	public void setModoUso(String modoUso) {
		this.modoUso = modoUso;
	}

	/**
	 * @return the contraIndicacoes
	 */
	public String getContraIndicacoes() {
		return contraIndicacoes;
	}

	/**
	 * @param contraIndicacoes the contraIndicacoes to set
	 */
	public void setContraIndicacoes(String contraIndicacoes) {
		this.contraIndicacoes = contraIndicacoes;
	}
}
