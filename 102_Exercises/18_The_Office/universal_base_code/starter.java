/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);

		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);

		Employee bob = new Employee(1234, "Bob", "Bobson", 3141.59);

		dwight.raiseSalary(-10);
		jim.raiseSalary(20);
		pam.raiseSalary(20);
		bob.raiseSalary(50);

		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		pam.employeeToString();
		bob.employeeToString();
	}
}
