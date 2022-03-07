package basics;

public class If_ElseIF_Example {

	public static void main(String[] args) {
		//if marks 80-100 -- distinction
		//marks 60-80 -- first class
		//marks 40-60 --second class
		//less than 40 --failed
		int marks=35;
		if (marks>=80) {
			System.out.println("Student passed with distinction : "+marks);
		} 
		else if (marks>=60 && marks <80) {
			System.out.println("Student passed in First class : "+marks);
		}
		else if (marks>=40 && marks <60) {
			System.out.println("Student passed in Second class : "+marks);
		}
		else {
			System.out.println("Student got marks less tan 40 and he is failed : "+marks);
		}
	}

}
