package java_programs;


public class Duplicate_string {
	public static void main(String[] args) {
		
	
           String s[] = {"vidya","ranjeet","vijay","vidya","shivank","snehal","gouri","shivank"};
          
           System.out.println(s);
           
           for(int i=0;i<s.length;i++)
           {
        	   for(int j=i+1;j<s.length;j++)
        	   {
        		   if(s[i]==s[j])
        		   {
        			  System.out.println(s[i]+" is duplicate String");
        		   }
        	   }
        	  
           }
}
}