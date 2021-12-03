package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[포인트] 영어로 쓰면 Point  x:" + x + ", y:" + y + " 입니다.";
	}

	//toString()을 작성 하세요

}
