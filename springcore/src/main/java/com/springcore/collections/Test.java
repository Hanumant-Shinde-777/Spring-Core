package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext contex =new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
Emp emp1=(Emp) contex.getBean("emp1");

System.out.println(emp1.getName());
System.out.println(emp1.getPhones());
System.out.println(emp1.getAddress());
System.out.println(emp1.getCourses());
System.out.println(emp1.getPhones().getClass().getName());
	}
}
