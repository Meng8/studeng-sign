package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Student;

@Service
public class StudentService {
	List<Student> lis=new ArrayList<Student>();
	Scanner sc  = new Scanner(System.in);
	//1.学生签到
	public void sign() {
		System.out.println("请输入学生姓名:");
		String name = sc.nextLine();
		Student stu=new Student(name);
		lis.add(stu);
		System.out.println("签到成功！");
		
	}
	//查询
	public void select() {
		System.out.println("请输入查询姓名：");
		String name = sc.nextLine();
		for (Student stu : lis) {
			if(stu.getName().equals(name)) {
				System.out.println(name+"已签到");
			}else {
				System.out.println(name+"未签到");
			}
			
		}
		
	}
	
	//统计
	public void count() {
		int count = lis.size();
		System.out.println("当前签到人数为："+count+"人");
	}
	
}
