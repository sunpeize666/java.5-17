package chapter13;
class Constructor{
	public int a = 3;
	public int b = 5;
	public int c = 7;
	public Constructor(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

public class OverloadTest1{
	public static void main(String args[]) {
		Constructor ct = new Constructor(2,4);
	System.out.println("객체변수 a : "+ ct.a);
	System.out.println("객체변수 a : "+ ct.b);
	System.out.println("객체변수 c : "+ ct.c);
	}
}