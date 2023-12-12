package java_programs;

public class Star_Pattern {
public static void main(String[] args) {
	   
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)//star j<=i increment 
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("===========================");
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)//j=i decrement
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("==================================");

	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<5;j++)
		{
			System.out.print(" ");
		}
       for(int k=1;k<=i;k++)
       {
    	   System.out.print("*");
       }
         System.out.println();
	}
	System.out.println("=========================");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=5;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("========================");
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<5;j++)//j=i decrement
		{
			System.out.print(" ");
		}
		for(int k=1;k<=5;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("=========================="+"Diamond");
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<5;j++)
		{
			System.out.print(" ");
		}
       for(int k=1;k<=i;k++)
       {
    	   System.out.print(" *");
       }
         System.out.println();
	}
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=4;k++)
		{
			System.out.print(" *");
		}
		System.out.println();
	
	}
	System.out.println("==================================");
}
}
