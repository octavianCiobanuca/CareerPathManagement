package com.example.springboot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Task;
	
	@Column(name = "titlu")
	private String titlu;
	
	@Column(name = "stare")
	private String stare;
	
	@Column(name = "dataStart")
	private Date dataStart;
	
	@Column(name = "deadline")
	private Date deadline;
	
	public int getId_Task() {
		return id_Task;
	}
	public void setId_Task(int id_Task) {
		this.id_Task = id_Task;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getStare() {
		return stare;
	}
	public void setStare(String stare) {
		this.stare = stare;
	}
	public Date getDataStart() {
		return dataStart;
	}
	public void setDataStart(Date dataStart) {
		this.dataStart = dataStart;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public Task() {
		super();
	}
	public Task(int id_Task, String titlu, String stare, Date dataStart, Date deadline) {
		super();
		this.id_Task = id_Task;
		this.titlu = titlu;
		this.stare = stare;
		this.dataStart = dataStart;
		this.deadline = deadline;
	}
}
