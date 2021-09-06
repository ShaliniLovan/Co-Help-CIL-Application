package CoHelp;
import java.util.*;

public class Home_Page {

    public static void main(String[] args)
    {
    	 System.out.println("Co-Help");
    	 System.out.println("----------Welcome to Co-Help Home Page----------");
    	  user();
    
    
    
    }
    
    static Registration_Login R=new Registration_Login();
    static Search src=new Search();
    static Order or=new Order();
   
    static void user()
    {
    	
    	 Scanner scanner = new Scanner(System.in);
    	   
    	
    	    System.out.print("1. Login");
    	    System.out.print("\n");
    	    System.out.print("2. Register new Account");
    	    System.out.print("\n");
    	    System.out.print("3. Search Products");
    	    System.out.print("\n");
    	    System.out.print("4. Order");
    	    System.out.print("\n");
    	    System.out.print("5. Exit");
    	    System.out.print("\n");
    	   
    	    
    	    int n=scanner.nextInt();
    	   
    	    if(n==1)
    	    {
    	    R.login();
    	    }
    	    if(n==2)
    	    {
    	    R.registartion();
    	       
    	    }
    	    if(n==3)
    	    {
    	    src.searchOrder();
    	    }
    	    if(n==4)
    	    {
    	    or.order();
    	    }
    	    if(n==5)
    	    {
    	    	System.out.println("****Logging off****");
    	    System.exit(0);
    	    }
    }
}