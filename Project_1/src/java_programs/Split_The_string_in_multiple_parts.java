package java_programs;

public class Split_The_string_in_multiple_parts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s ="java,selenium,testNg,maven";
   
       String s1[]=s.split(",");
       
       for(int i=0;i<s1.length;i++)
       {
    	   System.out.println(s1[i]);
       }
       
	}

}
