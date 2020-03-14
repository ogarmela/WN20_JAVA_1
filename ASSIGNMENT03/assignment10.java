package assignment08;

public class assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public StudentAdvanceTicket(int ticketNumber, int daysInAdvance){
			super(ticketNumber, daysInAdvance);
			//All student advance tickets are half price of advance tickets
			super.price = super.getPrice() / 2;		
		}//end of constructor
		
		//toString returns ticket data as a string.
		public String toString(){
			return super.toString() + "This ticket requires ID.\n";
		}//end of method toString
		


	}

}
