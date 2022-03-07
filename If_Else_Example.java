package basics;

public class If_Else_Example {

	public static void main(String[] args) {
		int age=18;
		//eligible age for vaccine is 18
		if (age>=18) {
			System.out.println("Age is greater than 18 , so Eligible for vaccine : "+age);
		} else {
			System.out.println("Age is less than 18, so not eligible for vaccine :"+age);
		}

	}

}
