package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); // fal
		System.out.println(p2 == p3); // fal
		System.out.println(p3 == p4); // fal
		System.out.println(p4 == p1); // tr		
		System.out.println(p1.equals(p2)); 
		// p1과 p2의 2,3 값이 같아 tr 이라고 생각했는데 fal 이었다
		// 2개의 객체를 따로 재정의 하지 않았기 때문에 같은 것이 아님 챕터3 ex03 참고
		
		System.out.println(p4.equals(p1)); // tr
		
		System.out.println("-------------------------------");


	}

}


