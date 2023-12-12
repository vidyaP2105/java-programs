package java_programs;

public class Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int a[]= {1,3,2,5,2,6,4};
               int count=0;
			
               for(int i=0;i<a.length;i++)
               {
            	   for(int j=i+1;j<a.length;j++)
            	   {
            		   if(a[i]==a[j])
            		   { 
            			   System.out.print(a[i]);
            		   }
            	   }
            	   
               }
               
	}

}
