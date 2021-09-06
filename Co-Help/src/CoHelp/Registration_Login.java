package CoHelp;

import java.util.HashMap;
import java.util.Scanner;

public class Registration_Login 
{
	static HashMap<String,String> hmap=new HashMap<>();
	static Home_Page hp=new Home_Page();
	
	 static void registartion()
	  {
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("----------Create New Account----------");
	 System.out.print("\n");
	  System.out.print(" Enter user name => ");
	       String userNames = sc.nextLine();

	       System.out.print(" Enter password => ");
	       String Password = sc.nextLine();
	       
	       if(isValid(Password))
	       {
	        hmap.put(userNames, Password);
	        System.out.println("\n");
	        System.out.println(" Registered Successfully!!");
	       hp.user();
	       }
	       
	       else
	       {
	        System.out.println("Error!! Password must contain 5 to 10 characters and should have atleast 1 digit 1 special character and one upper case and lower case letter");
	       }
	       
	          }

	 
	static boolean isValid(String Password)
	 
	 {
	 int lower=0,upper=0,digit=0,spl=0;
	 
	   if(Password.length()<5 || Password.length()>10)
	            {
	            return true;
	            }
	            for(int i=0;i<Password.length();i++)
	            {
	            if((Character.isDigit(Password.charAt(i))))
	            {
	            digit++;
	            }
	            else  if(Character.isUpperCase(Password.charAt(i)))
	            {
	            upper++;
	            }
	           
	            else if(Character.isLowerCase(Password.charAt(i)))
	            {
	            lower++;
	            }
	            else if(Password.charAt(i)=='@' || Password.charAt(i)=='#' || Password.charAt(i)=='&' || Password.charAt(i)=='%' || Password.charAt(i)=='*' || Password.charAt(i)=='!' || Password.charAt(i)=='"')
	            {
	            spl++;
	            }
	           
	            }
	            if(digit>0 && upper>0 && lower>0 && spl>0)
	            {
	            return true;
	            }
	            return false;
	           
	 }
	 
	           
	            static void login()
	            {
	           
	            System.out.println("----------Login to Co-Help----------");
	            Scanner sc=new Scanner(System.in);
	            System.out.print("Login");
	            System.out.println("\n");
	            System.out.print(" Enter user name => ");
	                 String uname = sc.nextLine();
	                       
	                 System.out.print(" Enter password => ");
	                 String password = sc.nextLine();
	                       
	                        if(hmap.containsKey(uname))
	                        {
	                        String str=hmap.get(uname);
	                        if(password.equals(str));
	                        {
	                        System.out.println(" User successfully logged-in.. ");
	                        }
	                       
	                        }
	                        else
	                    {
	                        System.out.print("\n");
	                    System.out.println("Invalid user details");
	                    registartion();
	                    }
	                   }
	           
	           }


