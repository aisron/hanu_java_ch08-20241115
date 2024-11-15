package ch10_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowTest test = new ThrowTest();
	//	test.goRun();  
	// 에러가 뜨는 걸 try catch로 변경
    // try catch 로 감싸서 프로그램이 문제없이 작동하게 한다.
		try {
			test.goRun();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
// 예외처리는 프로그램의 정지,종료를 막고 정상 실행을 유지하게 만드는 것이 목적	
		
		
		
	}

}
