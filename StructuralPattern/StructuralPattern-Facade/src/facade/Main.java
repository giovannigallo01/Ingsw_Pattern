package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int choice;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		do {
			 System.out.print("========= Mobile Shop ============ \n");
	         System.out.print("            1. IPHONE.             \n");
	         System.out.print("            2. SAMSUNG.            \n");
	         System.out.print("            3. HUAWAI.         	  \n");
	         System.out.print("            4. Exit.               \n");
	         System.out.print("Enter your choice: ");
	         
	         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	         choice = Integer.parseInt(in.readLine());
	         ShopKeeper sk = new ShopKeeper();
	         
	         switch(choice) {
	         case 1:
	        	 sk.iphoneSale();
	        	 break;
	         case 2:
	        	 sk.samsungSale();
	        	 break;
	         case 3:
	        	 sk.huaweiSale();
	        	 break;
	         case 4:
	        	 System.out.println("Good bye!");
	        	 return;
	         default:
	        	 System.out.println("Wrong choice!");
	        	 break;
	         }
		} while(choice != 4);
	}
}
