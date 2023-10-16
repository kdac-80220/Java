package com.shivshankar.assignment8q2;

class Box<T>
{
	private T obj;
	public void set(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return this.obj;
	}
}
public class CheckGeneric {
	
	public static void printDisplayable(Box<? extends Displayable> b)
	{
		b.get().displayData();
	}
	
	public static void printAny(Box<?>b)
	{
	
		System.out.println(b.get().toString());
	}
	
	public static void main(String[] args) {
		Person p=new Person();
		p.acceptData();
		
		Box<Person> p1=new Box<Person>();
		p1.set(p);
		printDisplayable(p1);
		
		Date d=new Date();
		d.acceptData();
		Box<Date> d1=new Box<Date>();
		d1.set(d);
		printAny(d1);
	}

}
