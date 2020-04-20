
public class cashar1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Create an Octagon object
		Octagon octagon1 = new Octagon(5);

		// Display area and perimeter of object
		System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + 
			"\nPerimeter: " + octagon1.getPerimeter());

		// Create new object using the clone method
		System.out.println("Cloning Octagon...");
		Octagon octagon2 = (Octagon)octagon1.clone();

		// Compare the two object using compareTo method
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}



	}


