package java_programs;

public class Find_Greatest_No_From_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a[]= {2,4,7,8,9,0};
            int max = 0 ;
            for(int i=0;i<a.length;i++)
            {
            	if(max<a[i])
            	{
            		max=a[i];
            	}
            }
            System.out.println(max+" is max no.");
	}

}
