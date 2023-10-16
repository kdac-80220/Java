package com.shivshankar.assignment8;


class Box<T extends Person>
{
	private T obj;
	
	public T get(T obj) {
		return obj;
	}
	
	public void set(T obj) {
		this.obj = obj;
	}

	public void getTotalSalary()
	{
		System.out.println(obj.calculateSalary()); 
	}

 }
public class GenericInheritance {
	

	public static void main(String[] args) {
		Employee e=new Employee();
		e.acceptEmployee();
		
		Box<Employee> p1=new Box<>();
		p1.set(e);
		p1.getTotalSalary();
	
		}
}
