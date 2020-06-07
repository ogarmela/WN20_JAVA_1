package chap3exercise;

import java.util.Scanner;

public class muno {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("prog7.dat");
        Scanner fin = new Scanner(file);
        Octagon first = null;
        int i = 1;
        Octagon older;

        while(fin.hasNext())
        {
            double side = fin.nextDouble();
            if(side < 0.0)
                break;
            Octagon oct = new Octagon(side);
            System.out.print("Octagon " + i + ": \"" + oct.toString() + "\"");
            if (first == null) {
                first = oct;
                System.out.print("Equal");
            }
            else {
                int comparison = oct.compareTo(first);
                if (comparison < 0)
                    System.out.print("less than first");
                else if (comparison > 0)
                    System.out.print("greater than first");
                else 
                    System.out.print("equal");
            }
            String cloneComparison = "Clone Compare: ";
            older = oct;
            Octagon clone = oct.clone();
            if ( older.getArea() == clone.getArea() ){
                cloneComparison = cloneComparison + "Equal";
            } else {
                cloneComparison = cloneComparison + "Not Equal";
            }
            //System.out.println(cloneComparison);
            i++; 
            first = new Octagon(side);
            System.out.println();
        }
        fin.close();
    }
}


