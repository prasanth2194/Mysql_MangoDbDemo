package com.prasanth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasanth.model.Employee;
@Repository
public interface EmpRepository extends JpaRepository <Employee,Integer>{

}
