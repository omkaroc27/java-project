package java.app;

import java.util.Comparator;

import com.beans.Employee;


public class EmpNameComparitor implements Comparator<Employee> {

	@Override
	public int compare(Employee n1, Employee n2) {
		return n1.getEmpName().compareTo(n2.getEmpName());
	}}
		
