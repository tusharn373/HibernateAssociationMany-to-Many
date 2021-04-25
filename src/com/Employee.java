package com;
import javax.persistence.*;
@Entity
@Table(name="emp111")
public class Employee {
	@Id
	int id;
	@Column
	String name;
	@Column
	String address;
	@Column
	float salary;
	public Employee()
	{}
	public Employee(int id, String name, String address, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

}
