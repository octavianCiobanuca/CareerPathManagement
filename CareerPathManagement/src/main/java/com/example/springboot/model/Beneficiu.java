package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiu")
public class Beneficiu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Beneficiu;
	
	@Column(name = "denumire")
	private String denumire;
	
	@Column(name = "nrTaskuri")
	private int nrTaskuri;
	
	public int getId_Beneficiu() {
		return id_Beneficiu;
	}
	public void setId_Beneficiu(int id_Beneficiu) {
		this.id_Beneficiu = id_Beneficiu;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public int getNrTaskuri() {
		return nrTaskuri;
	}
	public void setNrTaskuri(int nrTaskuri) {
		this.nrTaskuri = nrTaskuri;
	}
	public Beneficiu() {
		super();
	}
	public Beneficiu(int id_Beneficiu, String denumire, int nrTaskuri) {
		super();
		this.id_Beneficiu = id_Beneficiu;
		this.denumire = denumire;
		this.nrTaskuri = nrTaskuri;
	}
}
