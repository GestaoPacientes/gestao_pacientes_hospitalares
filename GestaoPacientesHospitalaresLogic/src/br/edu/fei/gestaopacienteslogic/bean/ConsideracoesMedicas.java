package br.edu.fei.gestaopacienteslogic.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * Representa as considerações médicas
 * @author Gabriel Lett Viviani <gm.lett@gmail.com>
 *
 */
public class ConsideracoesMedicas {

	/** Descrição dada pelo médico */
	private String descricao;
	
	/** Data da consideração */
	private Date data;
	
	/** Medico responsavel pela informação */
	private Medico medico;
	
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
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getDataFormatted(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		return sdf.format(this.getData());
	}
}
