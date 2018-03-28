package Scube.com.scube.webSer;

import java.util.ArrayList;
import java.util.List;

public class StucentRepo {

	
	List<Student> students ;
	
	public StucentRepo(){
		
		students = new ArrayList<Student>();
		
		Student s1 = new Student();
		
		s1.setId(101);
		s1.setFname("Fxyz");
		s1.setLname("Lxyz");
		
		
		Student s2 = new Student();
		
		s2.setId(102);
		s2.setFname("Fxx");
		s2.setLname("Lxx");
		
		
		Student s3 = new Student();
		
		s3.setId(103);
		s3.setFname("Fyy");
		s3.setLname("Lyy");
		
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
	}
	
	
	public List<Student> getStudents(){
		
		return students;
	}

	public Student getStudent(int id){
		
		for(Student s : students){
		
			if(s.getId() == id){
				return s;
			}
		}
		return null;
	}


	public void create(Student s1) {
		// TODO Auto-generated method stub
		
		students.add(s1);
	}
	
	
	
	
}
