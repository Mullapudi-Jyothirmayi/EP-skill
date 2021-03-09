package hibernate_student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Info")

public class Student_Bean
{
	@Id
	private int sregno;
	@Override
	public String toString() {
		return "Details [sregno=" + sregno + ", name=" + name + ", dob=" + dob + ", email=" + email + ", address="
				+ address + ", course=" + course + "]";
	}
	@Column
	private String name,dob,email,address,course;
	public int getSregno() {
		return sregno;
	}
	public void setSregno(int sregno) {
		this.sregno = sregno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
 
	
}
