package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	
	public boolean equals(Object obj) {
		Point p = ((Point)obj);
		if (this.x == p.x ) {
			return true;
		} else {
			return false;
		}
//	출력값 true - false - false - true
		
		
	/*
	배울때 y 값도 같으면 true 처리하기로 했었음
	배운거 생각나서 y도 같으면 같은걸로 만들어봤다
	물론 이대로 만들면 정답은 아님.
	public boolean equals(Object obj) {
		Point p = ((Point)obj);
		if (this.x == p.x ) {
			return true;
		} else if (this.y == p.y) {
			return true;
		} else {
			return false;
		}
		
		출력값 true - false - true - true
	*/			 
		
		
	}
	
}
