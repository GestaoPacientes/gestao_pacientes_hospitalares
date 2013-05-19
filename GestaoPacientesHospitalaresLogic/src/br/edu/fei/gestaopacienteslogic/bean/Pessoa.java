package br.edu.fei.gestaopacienteslogic.bean;

import java.util.Date;

import br.edu.fei.gestaopacienteslogic.enums.Sexo;

/**
 * Classe utilizada para representar uma pessoa, deve ser semple extendida
 * pelas diferentes formas de pessoa do sistema.
 * @author Gabriel Lett Viviani
 *
 */
public class Pessoa {
	/** Identificador unico da pessoa */
	private Integer ID;
	
	/** Nome do individou */
	private String nome;
	
	/** Número do Cadastro de Pessoa Fisica */
	private String CPF;
	
	/** RG */
	private String RG;
	
	/** Data de nascimento do individuo */
	private Date dataNascimento;
	
	/** Sexo do individuo */
	private Sexo sexo;
	
	/** Telefone do paciente */
	private String telefone;
	
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
	 * @return the cPF
	 */
	public String getCPF() {
		return CPF;
	}
	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	/**
	 * @return the rG
	 */
	public String getRG() {
		return RG;
	}
	/**
	 * @param rG the rG to set
	 */
	public void setRG(String rG) {
		RG = rG;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @return the sexo
	 */
	public Sexo getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the iD
	 */
	public Integer getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(Integer iD) {
		ID = iD;
	}

}
