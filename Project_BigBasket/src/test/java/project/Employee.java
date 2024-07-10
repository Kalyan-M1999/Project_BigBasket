package project;

public class Employee {
	    float salary = 40000;  
	}  

	class Tester extends Employee {  
	    int bonus = 10000;  
	    
	    public static void main(String[] args) {  
	        Tester p = new Tester();  
	        System.out.println("QA salary is: " + p.salary);  
	        System.out.println("Bonus of QA is: " + p.bonus);  
	    }  
	}


