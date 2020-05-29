
public class muno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteNums wn=new WriteNums();
		wn.writeNums(5);
		}

		public static void writeNums(int n) {
		    if (n == 1)
		      System.out.print("1");
		    else {
		      System.out.println(n);
		      writeNums(n - 1);
		      System.out.print(", " + n);
		    }
		  }



	}


