package com.example.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.springboot.model.Angajat;

public interface AngajatService {
	List<Angajat> getAllAngajati();
	void saveAngajat(Angajat angajat);
	Angajat getAngajatById(long idangajat);
	//adaugare angajat!!!!!
	void stergereAngajatById(long idangajat);
	Page<Angajat> findPaginated(int pageNo, int pageSize,String sortField, String sortDirection);
}
