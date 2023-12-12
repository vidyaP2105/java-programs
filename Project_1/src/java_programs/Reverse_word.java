package java_programs;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String v = "vidya patil";
             String[] v1= v.split(" ");
             
             for(int i=v1.length-1;i>=0;i--)
             { String s = v1[i];
            	 System.out.print(s + " ");
             }
	}

}
