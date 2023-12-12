package java_programs;

public class Palindrome_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 121;
        int p=num;
        int sum=0;
        int rimender;
        for(sum=0;num>0;num=num/10)
        { 
        	rimender = num%10;
        	sum = sum*10+rimender;
        	
        }
        if(p==sum)
        {
        	System.out.println("no is palindrom");
        }
        else
        {
        	System.out.println("no is not palindrome");
        }
        
        
	}

}
