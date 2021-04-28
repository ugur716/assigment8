package assigment8;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers:");
		System.out.println(isPalindromNumber(scan.nextInt()));
		
			
			
		}public static boolean isPalindromNumber(int num) {
			
			int counter=0;
			int num1=num;
			while(num>0) {
				
				counter=(counter*10)+num%10;
				num=num/10;
			}
			if(counter==num1) {
				return true;
			}else {
				
				return false;
			}
			
			
		}
	}
		
		
	


