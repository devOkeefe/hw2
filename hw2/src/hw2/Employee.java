package hw2;
import java.util.*;
public class Employee {
public int getHours() {
return 40; // works 40 hours / week
}
public double getSalary() {
return 40000.0; // $40,000.00 / year
}
public int getVacationDays() {
return 10; // 2 weeks' paid vacation
}
public String getVacationForm() {
return "yellow"; // use the yellow form
}
}
class Lawyer extends Employee {
public int getVacationDays() {
return super.getVacationDays() + 5;
}
public String getVacationForm() {
return "pink";
}
public void sue() {
System.out.println("I'll see you in court!");
}
}
class Janitor extends Employee {
	public int getHours() {
		return super.getHours() + 40;
	}
	public double getSalary() {
		return super.getSalary() - 10000;
	}
	public int getVacationDays() {
		return super.getVacationDays() - 5;
	}
	public void clean() {
		System.out.println("Cleaning!.");
	}
}
class HarvardLawyer extends Employee {
	
	public double getSalary() {
		return super.getSalary()*1.2;
	}
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
	public String getVacationForm() {
		return super.getVacationForm();
	}
	
}
class EmployeeMain{
	public static void printEmployee(Employee E) {
	if (E instanceof Lawyer) {
		Lawyer LA = (Lawyer)E;
		System.out.println("Lawyer");
		System.out.println("Hours "+ LA.getHours());
		System.out.println("Salary "+ LA.getSalary());
		System.out.println("Vacation Days "+ LA.getVacationDays());
		System.out.println("Vacation Form "+ LA.getVacationForm());
	}
	else if (E instanceof Janitor) {
		Janitor JA = (Janitor)E;
		System.out.println("Janitor");
		System.out.println("Hours "+ JA.getHours());
		System.out.println("Salary "+ JA.getSalary());
		System.out.println("Vacation Days "+ JA.getVacationDays());
		System.out.println("Vacation Form "+ JA.getVacationForm());
		JA.clean();
	}
	else if (E instanceof HarvardLawyer) {
		HarvardLawyer HL = (HarvardLawyer)E;
		System.out.println("Harvard Lawyer");
		System.out.println("Hours "+ HL.getHours());
		System.out.println("Salary "+ HL.getSalary());
		System.out.println("Vacation Days "+ HL.getVacationDays());
		System.out.println("Vacation Form "+ HL.getVacationForm());
	}
	}
	public static void main(String[] args) {
		Lawyer L = new Lawyer();
		Janitor J = new Janitor();
		HarvardLawyer H = new HarvardLawyer();
		printEmployee(L);
		printEmployee(J);
		printEmployee(H);
}
}