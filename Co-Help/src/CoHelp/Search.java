package CoHelp;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;


public class Search 
{
static Home_Page hp1=new Home_Page();
public  void searchOrder() {

Scanner sc = new Scanner(System.in);
String line = "";
String splitBy = ",";

System.out.println("----------Search Product----------");

try {

BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\shlovan\\eclipse-workspace\\JAVA_MAIN_ASSIGNMENT\\Book.csv"));
System.out.print("Enter Product name=>");

String str = sc.next();


int flag=1;

while ((line = br.readLine()) != null)
{

String[] Products = line.split(splitBy);

if (Products[1].contains(str))
{
flag=0;
System.out.println("-------------------");
System.out.println("Product Name: "+Products[1]);
System.out.println("Quantity left: "+Products[3]);
System.out.println("-------------------");
hp1.user();
break;
}
}

if(flag==1)
{
System.out.println("Product not available");
}

}
catch (IOException e)
{
	System.out.println("Product not available");
}
}
}