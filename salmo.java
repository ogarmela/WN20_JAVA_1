/* package chapter6;
* 
* Write a method called boyGirl that accepts a Scanner 

* 
* Erik 3 Rita 7 Tanner 14 Jillyn 13 Curtis 4 Stefanie 12 Ben 6 
* 
* Then the method should produce the following console output, 
* since the boys’ sum is 27 and the girls’ sum is 32: 
* 
* 4 boys, 3 girls 
* Difference between boys' and girls' sums: 5
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class salmo {

	public static void main(String[] args) throws FileNotFoundException{
        File f = new File("boysgirls.txt");
        Scanner input = new Scanner(f);
        boyGirl(input);
    }
    
    public static void boyGirl(Scanner inp){
        int boysTotal = 0;
        int boysNumbTotal = 0;
        int girlsTotal = 0;
        int girlsNumbTotal = 0;
        int count = 0;
        while (inp.hasNext()){
            if (count % 2 == 0){
                boysTotal++;
                boysNumbTotal += readNameNumber(inp);
            } else {
                girlsTotal++;
                girlsNumbTotal += readNameNumber(inp);
            }
            count += 1;
        }
        System.out.println(boysTotal + " boys, " + girlsTotal + "girls");
        System.out.println("Difference between boys' and girls' sums: " + Math.abs(boysNumbTotal - girlsNumbTotal));
    }
    
    public static int readNameNumber(Scanner inp){
        String name = inp.next();
        int    numb = inp.nextInt();
        //System.out.println(name + ": " + numb);
        return numb;
    }
}