package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.StudentService;


@SpringBootApplication
public class Bt1Application {

	@Autowired
	private static StudentService ss;
	
	public static void main(String[] args) {
		SpringApplication.run(Bt1Application.class, args);
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("*********欢迎使用学生签到系统**********");
			System.out.println("1.签到     2.查询签到学生    3.统计人数      4.退出");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				ss.sign();
				break;
			case 2:
				ss.select();
				break;
			case 3:
				ss.count();
				break;
			case 4:
				System.out.println("退出系统！");
				return;
	
			default:
				break;
			 }
		}
	}
	
	//@Bean
	/*public static void student() {
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("*********欢迎使用学生签到系统**********");
			System.out.println("1.签到     2.查询签到学生    3.统计人数      4.退出");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				ss.sign();
				break;
			case 2:
				ss.select();
				break;
			case 3:
				ss.count();
				break;
			case 4:
				System.out.println("退出系统！");
				return;
	
			default:
				break;
			 }
		}
	}*/
	
	
	
}
