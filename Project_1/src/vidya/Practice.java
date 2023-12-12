package vidya;

public class Practice {
public static void main(String[] args) {
	String s = "ranjeet";
	 int count = 0;
	 
	 for(int i=0;i<s.length();i++)
	 {
		 count=0;
		 char ch= s.charAt(i);
		 
		 for(int j=0;j<s.length();j++)
		 {
			 char c = s.charAt(j);
			 if(j<i && ch==c)
			 {
				 break;
			 }
			 if(ch==c)
			 {
				 count++;
			 }
			 
		 }
		 if(count!=0)
		 {
			 System.out.println(ch+" = "+ count);
		 }
	 }

}
}
