package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departament")
public class Departament {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Departament;
	
	@Column(name = "numeDepartament")
	private String numeDepartament;
	
	public int getId_Departament() {
		return id_Departament;
	}
	public void setId_Departament(int id_Departament) {
		this.id_Departament = id_Departament;
	}
	public String getNumeDepartament() {
		return numeDepartament;
	}
	public void setNumeDepartament(String numeDepartament) {
		this.numeDepartament = numeDepartament;
	}
	public Departament() {
		super();
	}
	public Departament(int id_Departament, String numeDepartament) {
		super();
		this.id_Departament = id_Departament;
		this.numeDepartament = numeDepartament;
	}
}
