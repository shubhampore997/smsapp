package equ.cjc.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import equ.cjc.main.model.Student;
import equ.cjc.main.model.service.StudentService;
import equ.cjc.main.repository.StudentRepository;

@Service
public class StudentServiceI implements StudentService {

	@Autowired
	StudentRepository sr;

	@Override
	public void saveStudentDetails(Student st) {
		
		sr.save(st);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return	sr.findAll();
	}

	@Override
	public List<Student> searchStudentBybatch(String batchNumber) {
		
		List<Student> batchstudents = sr.findAllByBatchNumber(batchNumber);
		
		return batchstudents;
	}

	@Override
	public Student getSingleStudent(int id) {
		Optional<Student>opStudent= sr.findById(id);
		
		return opStudent.get();
	}

	@Override
	public void updateStudentFees(int studentid, float ammount) {
		
		
		Optional<Student> opStudents =sr.findById(studentid);
		Student st = opStudents.get(); 
		
		st.setFeesPaid(st.getFeesPaid()+ ammount);
		sr.save(st);
	}

	
	@Override
	public void updatestudentbatch(int studentid, String bn) {
		
		
		Optional<Student> op =sr.findById(studentid);
		Student stu = op.get();
		
		stu.setBatchNumber(bn); 
		//stu.getBatchNumber();
		sr.save(stu);
		}

	
	@Override
	public void removestudent(int studentid) {
		
		sr.deleteById(studentid);
		
	}

	
	
	

	
	
	
	

}
