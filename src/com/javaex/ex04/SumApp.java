package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		
		int i, sum, parint;
		sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		System.out.println("입력한 숫자를 다 더해 드림 ㅇㅇ");
		System.out.print("숫자 입력 ㄱㄱ :");
		String numLine = sc.nextLine();
		//코드를 작성하세요
		
		
//		숫자 배열 만들기
		String[] nArray = numLine.split(" ");
		
		for (i=0; i<nArray.length; i++) {
			parint = Integer.parseInt(nArray[i]);
			sum = sum + parint;
		}
		
//		문제로 주어진 영역
		System.out.println("합:" + sum);
		
		sc.close();

		
		/*
		컨셉1 String numLine 을 int 로 바꾸는 메소드 사용
		결과 실패...
		while (true) {
			String snum = numLine.valueOf(sum);
//			sum = numLine + sum;
			sum = sum;
		}
		 */

	}

}
