package java_programs;

public class VovelsCount_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = "welcome";
      
   int count = 0;
   
   if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u"))
	{
		System.out.println("Vovel is present");
		count++;
		
	}
	else {
		
		System.out.println("Vovel is not present");

		}
   int size=s.length();
	System.out.println("Size of Given String======>" + size);
	
	char str[]=s.toCharArray();
	
	for(char vovel:str)
	{
		switch (vovel) 
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			count++;
			//break;
		}
	}
	System.out.println("Number of vovels present in Given String ======>"+ count);
	

	}

}
