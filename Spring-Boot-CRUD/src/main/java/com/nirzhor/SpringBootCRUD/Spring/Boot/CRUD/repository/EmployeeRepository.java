package com.nirzhor.SpringBootCRUD.Spring.Boot.CRUD.repository;

import com.nirzhor.SpringBootCRUD.Spring.Boot.CRUD.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
