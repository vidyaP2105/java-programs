package java_programs;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String v ="vidya";
         
         String a ="";
         for(int i=v.length()-1;i>=0;i--)
         {
        	 a = a + v.charAt(i);
         }
         System.out.println(a);
	}

}
