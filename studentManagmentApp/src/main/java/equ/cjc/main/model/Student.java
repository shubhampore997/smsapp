package equ.cjc.main.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StudentId;
	private String StudentFullName;
	@Column(unique = true)
	private String StudentEmail;
	private int StudentAge;
	private String StudentCollageName;
	private String StudentCourse;
	private String batchNumber;
	private String batchMode;
	private float feesPaid;
	
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentFullName() {
		return StudentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		StudentFullName = studentFullName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public float getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(float feesPaid) {
		this.feesPaid = feesPaid;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
	public String getStudentCollageName() {
		return StudentCollageName;
	}
	public void setStudentCollageName(String studentCollageName) {
		StudentCollageName = studentCollageName;
	}
	public String getStudentCourse() {
		return StudentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		StudentCourse = studentCourse;
	}
	
	
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getBatchMode() {
		return batchMode;
	}
	public void setBatchMode(String batchMode) {
		this.batchMode = batchMode;
	}
	
	
	
	
	
	
}
