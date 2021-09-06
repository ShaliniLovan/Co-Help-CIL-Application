package CoHelp;

import java.util.Date;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Order {

	
	public void order()
	{
	Scanner sc=new Scanner(System.in);
	String line = "";
	System.out.println("----------Book Order----------");

	System.out.print("Enter product name=>");

	String productname=sc.nextLine();

	System.out.print("Enter the Quantity=>");

	 int quantity=sc.nextInt();
	 
	 try {

	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shlovan\\eclipse-workspace\\JAVA_MAIN_ASSIGNMENT\\Book.csv"));
	
	int flag=1;
	while ((line = br.readLine()) != null) 
	{
	String[] Products = line.split(",");
	
	int Price=0;
	
	int qun=Integer.parseInt(Products[3]);


	if (Products[1].contains(productname) && qun>=quantity )

	{
	flag=0;
	
	System.out.println("-------------------------");
	System.out.println("Product Num:" +Products[0]);

	System.out.println("Product Name:" +Products[1]);

	System.out.println("Price:"  +Products[2]);

	System.out.println("Quantity left:" +Products[3]);
	System.out.println("---------------------------");
	
	int dec=Integer.parseInt(Products[3]);
	
	int  number = Integer.parseInt(Products[2]);

	Price=quantity*number;
	
	System.out.println("Confirm by clicking 1");
	int n=sc.nextInt();

	System.out.println("Enter Phone Number=>");
	int phone=sc.nextInt();
	
	int len= String.valueOf(phone).length();
	
	if(len==10)
	{
		int phno=phone;
	}
	else
	{
	System.out.println("Pls enter valid mobile number");
	}
	
	Date d1=new Date();
	

	if(n==1)
	{
	System.out.println("Your order has been successfully placed!!!");
	System.out.println("\n");
	System.out.println("****Thanks for choosing Co-Help****");

	try{

	           File file = new File("C:\\Users\\shlovan\\eclipse-workspace\\JAVA_MAIN_ASSIGNMENT\\Invoice.txt");
	           PrintWriter writer = new PrintWriter(file);
	           
	           writer.write("Product Number: "+Products[0]);
	           writer.write("\n");
	           writer.write("Product Name: "+Products[1]);
	           writer.write("\n");
	           writer.write("Quantity: "+quantity);
	           writer.write("\n");
	           writer.write("Price: "+quantity+"*"+Products[2]+"="+Price);
	           writer.write("\n");
	           writer.write("Phone Number: "+phone);
	           writer.write("\n");
	           writer.write("Date of Order: "+d1);
	           
	           
	           writer.close();
	           break;
	       }
	
	catch(IOException e)
	{
	           System.out.println("File not found");

	}
	break;
}

}

}
	if(flag==1)
	{
	System.out.println("product not available");
	}
	}
	 catch (IOException e)
	{
		 System.out.println("File not found");
	}
	 }
}