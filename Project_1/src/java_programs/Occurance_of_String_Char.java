package java_programs;

import java.util.*;

public class Occurance_of_String_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String v = "vidya patil";
		String v1 =v.replaceAll(" ", "");
		System.out.println(v1);
		char arr[] = v1.toCharArray();
		int count =0;
		Map <Character,Integer> map = new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{		
					count++;		
				}	
			}
			 map.put(arr[i],count);
		}
		
		System.out.println(map);
		
	}

}
