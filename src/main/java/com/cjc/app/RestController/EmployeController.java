package com.cjc.app.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.app.model.Employe;

import com.cjc.app.service.EmployeService;

@RestController
public class EmployeController {
	@Autowired
	EmployeService employeservice;
	
	
	
@PostMapping(value="/saveEmploye",consumes = { "application/xml","application/json"},produces = {"application/xml","application/json"})
 public Employe addEmploye(@RequestBody Employe employe) {
	 
	 Employe saveEmploye=employeservice.saveEmploye(employe);
	 
	 return saveEmploye;
 }





@GetMapping(value="/getEmploye/{id}",produces = {"application/xml","application/json"})
public Employe getEmploye(@PathVariable int id) {
	
	
	Employe getEmploye=employeservice.getEmploye(id);
	return getEmploye;
}

//url :-> Delete : http://localhost:9011/deleteProduct/{id}
@DeleteMapping(value="/deleteEmploye/{id}")
public void deleteEmploye(@PathVariable int id) {
	employeservice.deleteEmploye(id);
}
//url :-> allProducts : http://localhost:9011/getProducts
@GetMapping(value="/getEmploye")
public List<Employe> getEmploye(){
	List<Employe> plist=employeservice.getEmployes();
return plist;
}
@PutMapping(value="/updateEmploye/{id}",produces = "application/xml")
public Employe updateProduct(@PathVariable int id,  @RequestBody Employe employe) {
	
	System.out.println("Controllor");
	Employe updateEmploye=employeservice.updateEmploye(id,employe);
	
	return updateEmploye;
	
}
@PutMapping(value="/upEmploye/{id}")
public Employe upProduct(@PathVariable int id,@RequestBody Employe employe) {
	
	Employe updateEmploye = employeservice.updateProduct(id, employe);
	
	return updateEmploye;
}
	
}
