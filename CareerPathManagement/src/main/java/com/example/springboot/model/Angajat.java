package com.example.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "angajat")
public class Angajat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idangajat;
	
	@Column(name = "nume")
	private String nume;
	
	@Column(name = "prenume")
	private String prenume;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "salariu")
	private double salariu;
	
	@Column(name = "nr_telefon")
	private String nr_telefon;
	
	@Column(name = "functie")
	private String functie;	

	public long getIdangajat() {
		return idangajat;
	}
	public void setIdangajat(long idangajat) {
		this.idangajat = idangajat;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalariu() {
		return salariu;
	}
	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}

	public String getNr_telefon() {
		return nr_telefon;
	}

	public void setNr_telefon(String nr_telefon) {
		this.nr_telefon = nr_telefon;
	}
	public String getFunctie() {
		return functie;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
//	public Angajat() {
//		super();
//	}
//	public Angajat(int idangajat, String nume, String prenume, String email, double salariu, String nr_telefon,
//			String functie) {
//		super();
//		this.idangajat = idangajat;
//		this.nume = nume;
//		this.prenume = prenume;
//		this.email = email;
//		this.salariu = salariu;
//		this.nr_telefon = nr_telefon;
//		this.functie = functie;
//	}
}
