package InternPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetailsArrangementUsingComparator {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("choose the criteria to arrange the details");
		String criteria = scan.next();
		Comparator<Employee> comparator = new EmployeeIdComparator();
		if(criteria.equalsIgnoreCase("salary")) {
			comparator= new EmployeeSalaryComparator();
		}
		else if(criteria.equalsIgnoreCase("name")) {
			comparator = new EmployeeNameComparator();
		}
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("John", 4, 25000));
		list.add(new Employee("Greesham", 2, 30000));
		list.add(new Employee("Venky", 1, 50000));
		list.add(new Employee("JC", 5, 20000));
		list.add(new Employee("Gajala", 3, 29000));
		System.out.println(list);
		System.out.println("Dynamic Arrangement.....");
		Collections.sort(list, comparator);
		System.out.println(list);

	}

}
