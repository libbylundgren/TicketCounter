import java.util.Scanner;

public class TicketCounterLundgren {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		
		int numOfTickets = 0;
		int ticketMax = 75;
		int ticketLimit = 6;
		int totalCount = 0;
		int remainingTics = 0;
		int numBuyers = 0;
		Boolean maxReached = false;
		
		System.out.println("How many tickets do you want to buy?");
			numOfTickets = in.nextInt();
			
		while (totalCount < ticketMax){
			maxReached = false;
			if (numOfTickets <= ticketLimit){
				totalCount = (numOfTickets + totalCount);
				remainingTics = (ticketMax - totalCount);
				numBuyers = (numBuyers + 1);
				System.out.println("You purchased " + numOfTickets + " tickets.");
				System.out.println("There are " + remainingTics + " tickets remaining.");
				/*System.out.println("(Total Count: " + totalCount + ")");
				System.out.println("(Num of Buyers: " + numBuyers + ")");*/
				
				System.out.println("How many tickets do you want to buy?");
				numOfTickets = in.nextInt();
			}else if (numOfTickets > ticketLimit){
				System.out.println("Your number of tickets selected exceeds the max limit of 6 tickets.");
			/*	System.out.println("(Total Count is: " + totalCount + ")");
				System.out.println("(Num of Buyers: " + numBuyers + ")");*/
				
				System.out.println("How many tickets do you want to buy?");
				numOfTickets = in.nextInt();
			}
		}
		maxReached = true;
		System.out.println("All tickets have been purchased.");
		System.out.println("The total number of buyers is " + numBuyers + ".");
		
		in.close();
	}
}
