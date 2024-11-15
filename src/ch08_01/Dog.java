package ch08_01;

public class Dog implements Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("네 발로 움직인다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("아무거나 잘 먹는다");

	}
	


}
