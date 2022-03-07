package basics;

public class If_Else_2 {

	public static void main(String[] args) {
		int speed=35;
		//mileage is between 40 and 60 and then its in green zone
		//or condition || and condition &&
		if (speed>=40 && speed <=60) {
			System.out.println("You are driving in greenzone");
		} else {
			System.out.println("You are driving in Redzone");
		}

	}

}
