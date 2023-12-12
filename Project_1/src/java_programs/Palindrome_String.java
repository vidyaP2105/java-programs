package java_programs;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String v ="viv";
          
          String v1 = "";
          
          for(int i=v.length()-1;i>=0;i--)
          {
        	  v1 = v1 + v.charAt(i);
          }
          System.out.println(v1);
          if(v.equals(v1))
          {
        	  System.out.println("string is palindrome");
          }
          else
          {
        	  System.out.println("string is not palindrome");
          }
	}

}
