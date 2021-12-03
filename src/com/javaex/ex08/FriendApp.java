package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		/*
		친구정보 입력받아 Friend 객체 생성. 객체 배열에 저장
		친구 객체 3개 입력받고 출력
  		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("친구 3명을 등록해주세요.");
		
		String name, hp, school;
		
		Friend FriendLine = new FriendLine();
		
		
		sc.close();
		
	}

}
