package assigment8;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n-th Fibonacci Number:");
        int num = sc.nextInt();
        
        sc.close();
        
        System.out.println("n-th Fibonacci Number is: " + fibonacci(num));
    }
    
    public static int fibonacci(int num) {
        
        if(num <= 1) {
            return num;
        }else {
        	
        	 return fibonacci(num-1) + fibonacci(num-2);
        } 
        }
        

    } 

	


