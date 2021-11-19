package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.model.Angajat;
import com.example.springboot.repository.AngajatRepository;

@Service
@Transactional
public class AngajatiServiceImpl implements AngajatService{

	@Autowired
	private AngajatRepository angajatRepository;
	
	@Override
	public List<Angajat> getAllAngajati() {		
		return angajatRepository.findAll();
	}

	@Override
	public void saveAngajat(Angajat angajat) {
		this.angajatRepository.save(angajat);
	}

	@Override
	public Angajat getAngajatById(long idangajat) {
		Optional<Angajat> optional = angajatRepository.findById((long) idangajat);
		Angajat angajat = null;
		if(optional.isPresent()) {
			angajat = optional.get();		
		}else {
			throw new RuntimeException(" Angajatul nu s-a gasit pentru id-ul :: " + idangajat);
		}
		return angajat;
	}

	@Override
	public void stergereAngajatById(long idangajat) {
		long parsedId = idangajat;
		this.angajatRepository.deleteById(parsedId);
	}

	@Override
	public Page<Angajat> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.angajatRepository.findAll(pageable);
	}

}
