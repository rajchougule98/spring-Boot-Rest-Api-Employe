package com.cjc.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.model.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
