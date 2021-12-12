package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		/*
		친구정보 입력받아 Friend 객체 생성. 객체 배열에 저장
		친구 객체 3개 입력받고 출력
		prac5 ex07 참고
  		*/

		
		Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        System.out.println("이름 전번 학교 순서대로 사이를 공백으로 입력");
        System.out.println("ex) 김낑깡 010-1234-4321 제주감귤초등학교");
        String name, hp, school;
        
        
        //친구정보 3명 입력 로직 --> 반복문 사용
        
        
        
        
//      공백을 스플릿으로 나누기
        for(int i= 0; i<friendArray.length; i++) {
        	friendArray[i]= new Friend();
			String info= sc.nextLine();
			String[] sArray= info.split(" ");
			friendArray[i].toString();
//					.setting(sArray[0], sArray[1], sArray[2]);
		}
        
        
        
        int i=0; //do while 반복문에 써먹을 i값 초기화
        do { 
        	System.out.print("이름 :");
        	name = sc.nextLine(); //name으로 이름 받고
        	
        	System.out.print("전번 :");
        	hp = sc.nextLine();
        	
        	System.out.print("학교 :");
        	school = sc.nextLine();
        	System.out.println("---------------");
        	
        	
        	friendArray[i] = new Friend(); //반복하는 i만큼 Friend 객체 생성 
        	friendArray[i].setName(name); //name에 입력받은 name을 담는다
        	friendArray[i].setHp(hp);
        	friendArray[i].setSchool(school);
        	i++;
        }
        while (i<friendArray.length); // 친구배열만든 갯수 만큼 반복
        
        
        
        //친구정보 출력
        
        for (i=0; i<friendArray.length; i++) {
        	friendArray[i].showInfo();
//        	System.out.println(friendArray[i]);
        }
        
        
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("친구 3명을 등록해주세요.");
		
		String name, hp, school;
		
		name = sc.nextLine();
		
//		Friend FriendLine = new FriendLine();
		*/
		
		sc.close();
		
	}

}
