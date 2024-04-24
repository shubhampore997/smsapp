package equ.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import equ.cjc.main.model.Student;
import equ.cjc.main.model.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	StudentService ss;

	
	@RequestMapping("/")
	public String prelogin() {
		 
		return "login";
	}
	
	@GetMapping("/login")
	public String homelogin(@RequestParam String username,@RequestParam String password,Model m) {
		
		if(username.equals("admin")&& password.equals("admin@123")) {
			
			List<Student>students= ss.getAllStudents();
			m.addAttribute("data",students);
			
			return "adminscreen";
			}
		else {
			
		m.addAttribute("Login_Fail..","Enter valid login details....");
		return"login";
	} 
}
	
	
	@RequestMapping("/enroll_student")
	public String saveStudent(@ModelAttribute Student student,Model m) {
		ss.saveStudentDetails(student);
		List<Student>students= ss.getAllStudents();
		m.addAttribute("data",students);
		
	
		
		return "adminscreen";
	}
	
	
	@RequestMapping("/search")
	public String getBatchStudent(@RequestParam String batchNumber,Model m) {
		
		List<Student>result= ss.searchStudentBybatch(batchNumber);
		if(result.size()>0) {
			m.addAttribute("data",result);
		}
		else {
			
			List<Student> students=ss.getAllStudents();
			m.addAttribute("data",students);
			m.addAttribute("message","No Record are Availiable for the batch"+batchNumber+".....!");
		}
		return "adminscreen";
	}
	
	@RequestMapping("/fees")
	public String onfees(@RequestParam int id,Model m) {
		Student st= ss.getSingleStudent(id);
		m.addAttribute("st",st);
		return"fees";
	}
	
	
	@RequestMapping("/payfees")
	public String payFees(@RequestParam int studentid,@RequestParam float ammount,Model m) {
		
		ss.updateStudentFees(studentid,ammount);
		List<Student>students = ss.getAllStudents();
		m.addAttribute("data",students);
		
		return "adminscreen";
	}
	
	
	@RequestMapping("/batch")
	public String shiftbatch(@RequestParam int id,Model m) {
		Student batch= ss.getSingleStudent(id);
		m.addAttribute("batch",batch);
		return"batch";
	}
	
    @RequestMapping("/batchshift")
	public String updatestudentbatch(@RequestParam int studentid, @RequestParam String batchNumber,Model m) {
		
		ss.updatestudentbatch(studentid,batchNumber);
		List<Student>students = ss.getAllStudents();
		m.addAttribute("data",students);
		return "adminscreen";
	}
	  

    @RequestMapping("/attendance")
	public String attendance(@RequestParam int id,Model m) {
		Student attendance= ss.getSingleStudent(id);
		m.addAttribute("ats",attendance);
		return"attendance";
	}
    
    @RequestMapping("/studentattendance")
    public String studentattendance(@RequestParam int studentid,Model m) {
    	List<Student>students = ss.getAllStudents();
		m.addAttribute("data",students);
    	return"adminscreen";
    }
    
   @RequestMapping("/remove")
	public String remove(@RequestParam int id,Model m) {
		Student st= ss.getSingleStudent(id);
		m.addAttribute("st",st);
		return"remove";
	}
	
	@RequestMapping("/removestudent")
	public String removestudent(@RequestParam int studentid,Model m) {
		
		ss.removestudent(studentid);
		List<Student>students = ss.getAllStudents();
		m.addAttribute("data",students);
		
		return "adminscreen";
	}
	
	
	
	
	
	
	
	
	
}
