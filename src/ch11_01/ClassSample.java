package ch11_01;

import ch08_01.BlackEagle;

public class ClassSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체를 메모리에 만듬 
		BlackEagle blackEagle = new BlackEagle();  
		Class clazz = blackEagle.getClass(); // blackEagle 객체 클래스의 정보 가져오기
		System.out.println(clazz.getName()); // ch08_01.BlackEagle
		System.out.println(clazz.getSimpleName());  // BlackEagle 패키지를 제외한 이름만 출력
		System.out.println(clazz.getPackageName());  // ch08_01
		
		System.out.println("====================");
		
		
		String str="대한민국 파이팅!";
		System.out.println(str.charAt(3));  // 특정한 인덱스에 해당하는 문자 1개 반환
		
		
	}

}
