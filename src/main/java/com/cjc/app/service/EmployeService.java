package com.cjc.app.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.app.model.Employe;

@Service
public interface EmployeService {

	Employe saveEmploye(Employe employe);

	Employe getEmploye(int id);

	void deleteEmploye(int id);

	List<Employe> getEmployes();

	Employe updateEmploye(int id, Employe employe);

	Employe updateProduct(int id, Employe employe);

	

}
