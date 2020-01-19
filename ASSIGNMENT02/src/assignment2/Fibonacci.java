package assignment2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_n;
		int second_n;
		first_n = 1;
		second_n = 1;
		System.out.print(first_n + " " + second_n + " ");
	
	
	    for (int i = 0; i < 12; i++) {
	    	int next_n = first_n + second_n;
	    	first_n = second_n;
	    	second_n = next_n;
	    	System.out.print(second_n + " " );
	    }
	
	
	
	
	}

}
