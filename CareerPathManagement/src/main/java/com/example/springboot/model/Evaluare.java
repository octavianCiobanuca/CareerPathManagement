//package com.example.springboot.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "evaluare")
//public class Evaluare {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	@Column(name = "taskuriCorecte")
//	private int taskuriCorecte;
//	
//	@Column(name = "totalTaskuri")
//	private int totalTaskuri;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getTaskuriCorecte() {
//		return taskuriCorecte;
//	}
//	public void setTaskuriCorecte(int taskuriCorecte) {
//		this.taskuriCorecte = taskuriCorecte;
//	}
//	public int getTotalTaskuri() {
//		return totalTaskuri;
//	}
//	public void setTotalTaskuri(int totalTaskuri) {
//		this.totalTaskuri = totalTaskuri;
//	}
//	public Evaluare() {
//		super();
//	}
//	public Evaluare(int id, int taskuriCorecte, int totalTaskuri) {
//		super();
//		this.id = id;
//		this.taskuriCorecte = taskuriCorecte;
//		this.totalTaskuri = totalTaskuri;
//	}
//	
//}
