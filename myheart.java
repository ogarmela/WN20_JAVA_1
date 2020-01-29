package munomursal;

import java.util.Scanner;

public class myheart {
	// print the powers of given numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// inits
         Scanner sc = new Scanner(System.in);
         int base;
         int powers;
         // get the base and number of powers
       System.out.print("Enter the base: ");
       base = sc.nextInt();
       System.out.print("Enter the number of powers: ");
       Object numPowers = sc.nextInt();
       sc.close();
       
       // print our powers
       double val;
       for (int p = 0; p < numPowers; p++) {
    	   
    	   // calculate the value of the base raise to current power
    	   val = Math.pow(base, p);
    	   System.out.println(base + "^" + p + " = " + val);
       }
	}

}
