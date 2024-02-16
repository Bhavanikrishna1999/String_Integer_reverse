package test;
import java.util.*;
public class Integer_Resverse 
{
	public static void main(String[] args) 
	{
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number");
       int num=s.nextInt();
       
       int revers=0;
       System.out.println("Reverse of Number");
       
       while(num !=0)
       {
    	   int digtal=num%10;
    	   revers=revers*10+digtal;
    	   num /=10;
       }
       System.out.println("Number:"+revers);
	}

}
