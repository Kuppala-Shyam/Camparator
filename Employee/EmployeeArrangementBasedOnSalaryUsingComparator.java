package InternPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeArrangementBasedOnSalaryUsingComparator {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("John", 4, 25000));
		list.add(new Employee("Greesham", 2, 30000));
		list.add(new Employee("Venky", 1, 50000));
		list.add(new Employee("JC", 5, 20000));
		list.add(new Employee("Gajala", 3, 29000));
		System.out.println(list);
		Collections.sort(list, new EmployeeSalaryComparator());
		System.out.println(list);

	}

}
