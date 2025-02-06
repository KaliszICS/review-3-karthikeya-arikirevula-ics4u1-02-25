import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		String question1;
		System.out.print("In: ");
		question1 = in.nextLine();
		System.out.println(question1.charAt(0));
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		boolean question2;
		System.out.print("In: ");
		question2 = in.nextBoolean();
		in.nextLine();
		System.out.println(!question2);
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		int question3;
		System.out.print("In: ");
		question3 = in.nextInt();
		in.nextLine();
		System.out.println(question3 > 5);
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		double question4;
		System.out.print("In: ");
		question4 = in.nextDouble();
		in.nextLine();
		System.out.println(question4 >= -2 && question4 <= 2);

	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		String question5;
		System.out.print("In: ");
		question5 = in.nextLine();
		System.out.println(question5.equals("Hello World"));
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		int question6first;
		System.out.print("In: ");
		question6first = in.nextInt();
		in.nextLine();
		int question6second;
		System.out.print("In: ");
		question6second = in.nextInt();
		in.nextLine();
		System.out.println(question6first <= question6second);
		
	}

	public static void q7() {
		Scanner in = new Scanner(System.in);
		double question7first;
		System.out.print("In: ");
		question7first = in.nextDouble();
		in.nextLine();
		double question7second;
		System.out.print("In: ");
		question7second = in.nextDouble();
		in.nextLine();
		System.out.println(question7first > question7second);
		
	}

}
