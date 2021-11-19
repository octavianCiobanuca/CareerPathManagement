package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pozitie")
public class Pozitie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pozitie;
	
	@Column(name = "titlupozitie")
	private String titlupozitie;
	
//	@OneToOne
//	private Task task;
	
	public int getId_Pozitie() {
		return id_pozitie;
	}
	public void setId_Pozitie(int id_Pozitie) {
		this.id_pozitie = id_Pozitie;
	}
	public String getTitluPozitie() {
		return titlupozitie;
	}
	public void setTitluPozitie(String titluPozitie) {
		this.titlupozitie = titluPozitie;
	}
//	public Task getTask() {
//		return task;
//	}
//	public void setTask(Task task) {
//		this.task = task;
//	}
	public Pozitie() {
		super();
	}
	public Pozitie(int id_pozitie, String titlupozitie, Task task) {
		super();
		this.id_pozitie = id_pozitie;
		this.titlupozitie = titlupozitie;
//		this.task = task;
	}
}
