package com.cjc.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.app.Repository.EmployeRepository;
import com.cjc.app.model.Employe;

@Service
public class EmployeServiceImpl implements EmployeService {

	EmployeRepository employerepository;

	@Override
	public Employe saveEmploye(Employe employe) {
		Employe saveEmploye = employerepository.save(employe);
		return saveEmploye;
	}

	@Override
	public Employe getEmploye(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmploye(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employe> getEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe updateEmploye(int id, Employe employe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe updateProduct(int id, Employe employe) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
