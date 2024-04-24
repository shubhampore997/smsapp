package equ.cjc.main.model.service;

import java.util.List;

import equ.cjc.main.model.Student;

public interface StudentService {

	public void saveStudentDetails(Student st);

	public List<Student> getAllStudents();

	public List<Student> searchStudentBybatch(String batchnNmber);

	public Student getSingleStudent(int id);

	public void updateStudentFees(int studentid, float ammount);

    public void updatestudentbatch (int studentid, String bn);
    
    public void removestudent(int studentid);

	

	

	

	

	

	









	

	

	

}
