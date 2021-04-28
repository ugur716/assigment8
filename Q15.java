package assigment8;

public class Q15 {

	public static void main(String[] args) {
		System.out.println(validateTask(true,3,2));
		System.out.println(validateTask(true,4,2));
		System.out.println(validateTask(false,3,2));
		System.out.println(validateTask(true,5,4));
		

	}public static boolean validateTask(boolean res,int task,int currentID) {
		int taskld=0;
		 taskld=currentID+1;
		
		
		if(res && task==taskld) {
			return true;
			
			
			}
		
			return false;
		}
		
		
	}


