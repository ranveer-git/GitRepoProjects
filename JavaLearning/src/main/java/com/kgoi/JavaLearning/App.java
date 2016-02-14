package com.kgoi.JavaLearning;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	public static App a;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        a = new App();
        System.out.println(a.makeObjects1());
        System.out.println(App.makeObjects());
        
        System.out.println(a.makeObjects1());
        System.out.println(App.makeObjects());
        
        System.out.println(a.makeObjects1());
        System.out.println(App.makeObjects());
    }
    
    public static List makeObjects(){
    	List<Person> personList = new ArrayList<Person>();
    	Person p = null;
    	for(int i = 0;i<50000;i++){
    		p = new Person("FirstNameStatic"+i, "LastNameStatic"+i, i, "SSNStatic"+i);
    		personList.add(p);
    	}
    	return personList;
    }
    
    public List makeObjects1(){
    	List<Person> personList = new ArrayList<Person>();
    	Person p = null;
    	for(int i = 0;i<5000;i++){
    		p = new Person("FirstName"+i, "LastName"+i, i, "SSN"+i);
    		personList.add(p);
    	}
    	return personList;
    }
}
class Person{
	private String firstName;
	private String lastName;
	private Integer age;
	private String ssn;
	
	public Person(String firstName, String lastName, Integer age, String ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", ssn=" + ssn + "]";
	}
	
}
