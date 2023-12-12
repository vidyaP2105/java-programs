package java_programs;
import java.util.Scanner;
public class Amsrtong_No {
public static void main(String[] args) {
	int p,sum,remainder;
	
	//System.out.println("Enter one Number");
	
	//Scanner sc= new Scanner(System.in);
	int num = 153;        //153
	//153=1^3=1=1
	//    5^3=125
	//    3^3=27
	//   = 153
	
	p=num;      //153=1531
	
	      //0   153    true
	for(sum=0;num>0;num=num/10)
	{
		remainder = num%10;    //3
		
		sum = sum + remainder*remainder*remainder;
	//   27  =  0  +  3*3*3  ==27
	}
	if(sum==p)
	{
		System.out.println("This is ArmStrong Number");
	}
	else
	{
		System.out.println("This is not ArmStrong Number");
	}
}

}

