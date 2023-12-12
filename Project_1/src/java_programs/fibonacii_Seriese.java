package java_programs;

public class fibonacii_Seriese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=0;
           int b=1;
             int  Febo;
             
          for(int i=1;i<=10;i++)
          {
        	  Febo=a+b;
        	  a=b;
        	  b=Febo;
        	  System.out.print(Febo+",");
          }
        	  
	}

}
