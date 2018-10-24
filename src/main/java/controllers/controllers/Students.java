package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {
	
	@XmlElement(name="student")
	private List<Student> students= new ArrayList();

	public List<Student> getStudents() {
		return students;
	}

	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudents(List<Student> s)
	{
		this.students.addAll(s);
	}

}
