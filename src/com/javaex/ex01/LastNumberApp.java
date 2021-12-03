package com.javaex.ex01;

public class LastNumberApp {

	public static void main(String[] args) {

		// 수정하지 마세요
		lastValue();
	}


	//런타임시 오류발생
	public static void lastValue() {

		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result;
		
		//아래부분을 try~catch문을 사용하여 수정하세요
		
		
		try {
			result = intArray[3];
			System.out.println(result);
//			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 범위를 넘었습니다.");
		} finally {
			System.out.println("finally 영역 출력-배운거 생각나서 한번 해봄");
		}
	}

}
