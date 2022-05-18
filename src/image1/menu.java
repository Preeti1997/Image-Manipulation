package image1;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		int choice=0;
		while(true)
		{
			System.out.println("items available:\n1. samosa\n2. chana masala\r\n3. paneer roll\r\n4. naan\n5. Exit"); 
            System.out.println("Select an item");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Selected item is samosa");
		       break;
		     
		case 2:System.out.println("Selected item is chana masala");
	       break;
		case 3:System.out.println("Selected item is paneer roll");
	       break;
		case 4:System.out.println("Selected item is naan");
	       break;
		case 5:System.exit(0);
	      
		}
		}
			
			
			
			
			
		
		
		
		
		
		
		
		
		

	}

}
