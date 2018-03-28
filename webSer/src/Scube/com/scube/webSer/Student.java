package Scube.com.scube.webSer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private int id;
	private String Fname;
	private String Lname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname
				+ "]";
	}

	
}
