package equ.cjc.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import equ.cjc.main.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{
	
	public List<Student> findAllByBatchNumber(String batchNumber);
 	
  

}
