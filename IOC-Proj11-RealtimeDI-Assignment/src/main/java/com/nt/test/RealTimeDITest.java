package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.VO.EmployeeVO;
import com.nt.controller.MainController;

public class RealTimeDITest {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		MainController controller = factory.getBean("controller", MainController.class);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Number : ");
		String eno = sc.next();
		System.out.println("Enter Employee Name : ");
		String ename = sc.next();
		System.out.println("Enter Employee Designation : ");
		String desg = sc.next();
		System.out.println("Enter Employee BasicSalary : ");
		String basicsalary = sc.next();

		EmployeeVO vo = new EmployeeVO();
		vo.setEno(eno);
		vo.setEname(ename);
		vo.setDesg(desg);
		vo.setBasicsalary(basicsalary);
		try {
			String result = controller.processEmployee(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
