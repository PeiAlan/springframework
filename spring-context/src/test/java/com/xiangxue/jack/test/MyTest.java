package com.xiangxue.jack.test;

import com.xiangxue.jack.bean.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MyTest {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student)applicationContext.getBean("student");
		System.out.println(student.getUsername());
	}

	@Test
	public void test2(){
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
	}
}
