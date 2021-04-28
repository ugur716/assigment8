package assigment8;

public class Q16 {

	public static void main(String[] args) {
		

		System.out.println(simpleRoomBook(true,7 , 2, 2018));
		System.out.println(simpleRoomBook(true,2 , 1, 2018));

	}
	public static boolean simpleRoomBook(boolean isRoomAvailable, int month, int day, int year) {
		boolean isDateAvailable = true;

		if (!isRoomAvailable) {
			isDateAvailable = false;
		} else if (year == 2018) {
			if (month == 7) {
				if (day >= 1 && day <= 8) {
					isDateAvailable = false;
				}
			}
		}

		return isDateAvailable;

	}

}
