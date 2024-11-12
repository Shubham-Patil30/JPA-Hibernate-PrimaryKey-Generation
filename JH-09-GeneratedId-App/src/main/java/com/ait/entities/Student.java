package com.ait.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="students_table1")
public class Student{
	 
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "idgen")
	@SequenceGenerator(name = "idgen" ,sequenceName = "my_seq", allocationSize = 1 )
	private Integer sId; 
	
	private String sname ;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	} 
	
	
}
