package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("2개의 정수로 사칙연산만 가능한 계산기");
    	System.out.println("계산식을 입력하세요 ex)1+1 종료는/q");
    	
    	
    	
    	int num;
    	num = sc.nextInt();
    	
    	
    	while (true) {
    		System.out.print(">>");
    		String cal = sc.nextLine();
//    		Integer.parseInt([0],[2])
    		
    		switch () {
    			case '+' :
    			case '-' :
    				
    			default : {
    				System.out.println("잘못된 입력입니다");
    			}
    				
    		}
    	}
    	
    	
    	
    	sc.close();
    }
}





/*
while (true) {
System.out.print(">>");
String cal = sc.nextLine();

if (cal=="hi") {
	System.out.println("계산값");
} else if (cal == "/q") {
	System.out.println("종료합니다.");
	break;
} else {
	System.out.println("알 수 없는 연산입니다.");
}
}
*/
