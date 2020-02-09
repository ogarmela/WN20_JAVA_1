package assignment5b;

import java.util.Scanner;

public class printGPA {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
	    System.out.print("Enter a student record: ");
	    String name = console.next();
	    int num = console.nextInt();
	    double sum = 0;
	    for(int i = 0; i < num; i++)
	        sum += console.nextInt();
	    System.out.println(name + "'s grade is " + sum / num);

	}

}
