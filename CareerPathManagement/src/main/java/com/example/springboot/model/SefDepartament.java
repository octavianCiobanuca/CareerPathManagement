package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Table;

@Entity
public class SefDepartament extends Angajat{
	@Column(name = "functie")
	private String functie;

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public SefDepartament() {
		super();
	}

	public SefDepartament(String functie) {
		super();
		this.functie = functie;
	}

//	public SefDepartament(int id_angajat, String nume, String prenume, String email, double salariu, String nr_telefon,
//			String functie) {
//		super(id_angajat, nume, prenume, email, salariu, nr_telefon, functie);
//	}
	
}
