package com.klu;

public class Employee {
	private static int empno;
	private static String empname;
	public static int getEmpno() {
		return empno;
	}
	public static void setEmpno(int empno) {
		Employee.empno = empno;
	}
	public static String getEmpname() {
		return empname;
	}
	public static void setEmpname(String empname) {
		Employee.empname = empname;
	}
	
}
