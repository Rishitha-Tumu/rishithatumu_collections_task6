package Session6.Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Custom 
{
	//Yesu Prabhu and Mary Matha and Joseph
	public void method(ArrayList<Integer> list)
    {
	    Scanner s=new Scanner(System.in);
	    while(true)
	    {
	        System.out.println("Menu");
	        System.out.println("1.Fetch the element from the particular position");
	        System.out.println("2.Add the element to the array list");
	        System.out.println("3.Remove the element from the particular poition");
	        System.out.println("4.Print the array list");
	        System.out.println("5.Exit from the loop");
	        System.out.print("Please enter your choice:");
	        int r=s.nextInt();
	        if(r==1)
	        {
	            System.out.print("Enter the index from 0 to "+list.size()+":");
	            int m=s.nextInt();
	            System.out.println("The value at the position "+m+" is : "+list.get(m));
	        }
	        if(r==2)
	        {
	            System.out.print("Enter the element to add to the array list:");
	            int m=s.nextInt();
	            list.add(m);
	        }
	        if(r==3)
	        {
	            System.out.print("Enter the index from 0 to "+list.size()+":");
	            int m=s.nextInt();
	            int x=list.get(m);
	            System.out.println("The value removed from the array list is : "+x);
	            list.remove(m);
	        }
	        if(r==4)
	        {
	            System.out.println("The array list is: "+list);
	        }
	        if(r==5)
	        {
	            System.out.println("----exit----");
	            System.exit(0);
	        }
	    }
    }
}
