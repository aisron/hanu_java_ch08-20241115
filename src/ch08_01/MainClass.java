package ch08_01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스는 선언만 가능하다.
		Animal animal;             
		
	
		Dog dog = new Dog(); // 인스턴스화 가능 (메로리에 객체 생성가능) 
		animal = dog;        // 인터페이스 변수에 자식클래스로 만든 구현 객체 대입
		Eagle eagle = new Eagle();
		animal = eagle;     // 인터페이스 변수에 자식클래스로 만든 구현 객체 대입
		BlackEagle blackEagle =new BlackEagle();
		animal = blackEagle;  // 인터페이스 변수에 자식 클래스에서 상속 받은 손자 클래스 객체도 대입 가능
		Pudel pudel = new Pudel();
		animal = pudel;
		animal.cry(); 

		
		Pudel Pudel =new Pudel(); //부모가 Dog 클래스
		dog = pudel; // 부모는 자식의 모든 것을 받아준다
		pudel = (Pudel) dog;
		
		animal = dog;
		dog = (Dog) animal;
		
//		if(pudel instanceof Eagle) {   // 푸들이 이글이 맞는지
//			eagle = pudel;             // 확인 후 작업해라  
//		}
		
		
//		예외처리 
		try {
			String won = "1,000";  // , 쉼표로 인한 NumberFormatException 에러
			int pay = Integer.parseInt(won);
			double pay2 = pay * 0.9;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("예외처리 구간 통과");
		System.out.println("프로그램 정상 종료");
		
	
	
	}

	
	
	
	
	
	
	
	
}
