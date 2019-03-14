package com.soumyadeep.journaldev.prototype;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employees emp = new Employees();
		emp.loadData();

		Employees empNew1 = (Employees) emp.clone();
		Employees empNew2 = (Employees) emp.clone();

		List<String> list = empNew1.getEmpList();
		list.add("John");
		List<String> list1 = empNew2.getEmpList();
		list1.remove("Pankaj");

		System.out.println("emps List: " + emp.getEmpList());
		System.out.println("empsNew1 List: " + list);
		System.out.println("empsNew2 List: " + list1);

	}
}
