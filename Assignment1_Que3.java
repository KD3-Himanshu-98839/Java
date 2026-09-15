import java.util.Scanner;
public class Assignment1_Que3 {
	int price_of_samosa = 10;
	int price_of_Idli = 20;
	int price_of_Dosa = 40;



	public static void main(String[] args) {
		Assignment1_Que3 aq = new Assignment1_Que3();


		Scanner sc = new Scanner(System.in);
		int bill = 0;
		int choice = 0;

		while (choice != 5) {
			
			 System.out.println("\n=========================== MENU-LIST =============================");
	         System.out.println("1. Dosa");
	         System.out.println("2. Samosa");
	         System.out.println("3. Idli ");
	         System.out.println("4. Total Bill ");
	         System.out.println("5. Exit ");
	         System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Dosa 40rs per plate.");
				System.out.print("Enter the quntity: ");
				int q1 = sc.nextInt();
				bill = bill + q1 * aq.price_of_Dosa;

				break;

			case 2:
				System.out.println("Samosa 10rs per piece.");
				System.out.print("Enter the quntity: ");
				int q2 = sc.nextInt();
				bill = bill+ q2 * aq.price_of_samosa;
				break;

			case 3:
				System.out.println("Idli 20rs per plate.");
				System.out.print("Enter the quntity: ");
				int q3 = sc.nextInt();
				bill = bill + q3 * aq.price_of_Idli;
				break;
			case 4:
				System.out.println("Total bill is: "+bill);
				break;
			 case 5:
                 System.out.println("Thank you for ordering! Final bill: " + bill + "rs");
                 break;

             default:
                 System.out.println("Invalid choice. Please try again.");
                 break;

			}


		}


	}

}
