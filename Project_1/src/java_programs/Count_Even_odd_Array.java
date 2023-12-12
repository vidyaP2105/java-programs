package java_programs;

public class Count_Even_odd_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]= {1,2,3,4,5,6,7,8};
		int even = 0;
		int odd = 0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]%2==0)
			{
				System.out.println("even = "+s[i]);
				even++;
			}
			else
			{
				System.out.println("odd = "+s[i]);
				odd++;
			}
		}
   System.out.println("even count is "+ even);
   System.out.println("odd count is "+ odd);
	}

}
