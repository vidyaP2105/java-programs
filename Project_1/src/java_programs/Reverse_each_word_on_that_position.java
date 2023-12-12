package java_programs;

public class Reverse_each_word_on_that_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String v ="vidya balavant patil";
        String v1[]= v.split(" ");
        String r = " ";
        
        for(int i=0;i<v1.length;i++)
        {    String k = v1[i];
        	String s = " ";
        	for(int j=k.length()-1;j>=0;j--)
        	{
        		s = s + k.charAt(j);
        	}
        	r = r + s;
        	r.trim();
        	
        }
        System.out.println(r);
	}

}
