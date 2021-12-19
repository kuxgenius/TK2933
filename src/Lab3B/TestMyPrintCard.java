package Lab3B;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestMyPrintCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input;
		int n,c=1;
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		do {
			MyPrintCard card = new MyPrintCard();
			n = in.nextInt();
			
			if (n == 0)
				break;
			
			System.out.println("Case #"+c+":");
			
			for (int x=0;x<n;x++) {
				char op = in.next().charAt(0);
				
				switch(op){
					case '=':
						System.out.println("RM"+df.format(card.getBalance()));
						break;
					
					case '+':
						input = in.nextDouble();
						card.topupCard(input);
						System.out.println("RM"+df.format(card.getBalance()));
						break;
						
					case '-':
						input = in.nextDouble();
						if (card.payService(input) == true)
							System.out.println("RM"+df.format(card.getBalance()));
						else
							System.out.println("invalid");
						break;
					
					default:
						System.out.println("invalid");
						break;
				}
				
			}

			c++;
			
		} while (n != 0);
				
	}

}
