package com.te.DemoSpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.DemoSpringDemo.bean.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("listconfig.xml");
		Customer customer =  (Customer) ctx.getBean("customer");
		
		System.out.println(customer);
		System.out.println(customer.getProducts().getClass());
		System.out.println(customer.getContacts().getClass());
		
		
	}

}
