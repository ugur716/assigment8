package assigment8;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		plus();
		
	}
	
	public static void plus() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");
		int str1=scan.nextInt();
		System.out.println("enter second number:");
		int str2=scan.nextInt();
		int result=str1+str2;
		System.out.println("result: "+result);
		
	}

}
