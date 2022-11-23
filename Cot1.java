package Java.com;

public class Cot1 {
	public Cot1() {
		this("java");
		System.out.println("default const..");
	}
	public Cot1(int id) {
	this(334.54f);
	System.out.println(id);
	}
	public Cot1(String name) {
		this(12);
		System.out.println(name);
}
	public Cot1(float sal) {
		System.out.println(sal);
		
	}public static void main(String[]args) {
		Cot1 J=new Cot1();
	}




}
