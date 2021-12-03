package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		System.out.println("입력한 숫자를 다 더해 드림 ㅇㅇ");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		
		/*
		컨셉1 String numLine 을 int 로 바꾸는 메소드 사용
		컨셉2 
		*/
		int i = 0;
		
		while (true) {
			String snum = numLine.valueOf(sum);
//			sum = numLine + sum;
			sum = sum;
		}
		
		
		
		
		
//		문제로 주어진 영역
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
