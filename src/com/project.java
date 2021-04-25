package com;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="Proj")
public class project {
	@Id
int pid;
@Column
	String pname;
@Column
float pduration;
@ManyToMany(cascade=CascadeType.ALL)
List<Employee>emplist;
public project() {}
public project(int pid, String pname, float pduration, List<Employee> emplist) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pduration = pduration;
	this.emplist = emplist;
}
}