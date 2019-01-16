/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.monitoreomvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "dbo.Causas")
public class Causa implements Serializable {
	@Id
	@Column(name = "id_causa")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_causa;
	@Column(name = "Codigo_causa")
	private String codigo_causa;
	@Column(name = "Nombre_causa")
	private String nombre_causa;

	public Causa(Long id_causa, String codigo_causa, String nombre_causa) {
		this.id_causa = id_causa;
		this.codigo_causa = codigo_causa;
		this.nombre_causa = nombre_causa;
	}

	/**
	 * @return the id_causa
	 */
	public Long getId_causa() {
		return id_causa;
	}

	/**
	 * @param id_causa the id_causa to set
	 */
	public void setId_causa(Long id_causa) {
		this.id_causa = id_causa;
	}

	/**
	 * @return the codigo_causa
	 */
	public String getCodigo_causa() {
		return codigo_causa;
	}

	/**
	 * @param codigo_causa the codigo_causa to set
	 */
	public void setCodigo_causa(String codigo_causa) {
		this.codigo_causa = codigo_causa;
	}

	/**
	 * @return the nombre_causa
	 */
	public String getNombre_causa() {
		return nombre_causa;
	}

	/**
	 * @param nombre_causa the nombre_causa to set
	 */
	public void setNombre_causa(String nombre_causa) {
		this.nombre_causa = nombre_causa;
	}

	@Override
	public String toString() {
		return "tbCausas{" + "id_causa=" + id_causa + ", codigo_causa=" + codigo_causa + ", nombre_causa="
				+ nombre_causa + '}';
	}

}
