package ch08_01;

public class Eagle implements Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("두 날개로 날아간다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("캬캬캬캬캬캬캬");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("고기를 먹는다");
	}

}
