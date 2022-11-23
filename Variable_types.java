package Java.com;

public class Variable_types {
	int a=100;
	int b;
	static int c=45;
	public void briyani() { 
		int e=20;
		System.out.println("Cost of one plate Briyani is "+a);
		System.out.println("Cost of one halfboil is "+e);
	}
	public void juice() {
		int f=40;
		System.out.println("Cost of one Watermelon juice is "+f);
		System.out.println("Cost of Tax is "+b);
		
	}
	public static void main(String[]args) {
		Variable_types Bill=new Variable_types();
		Bill.briyani();
		Bill.juice();
		System.out.print("Cost of pineapple juice is "+c);
		
	}}
		
		
		
		
	


