package java_programs;

public class Second_highest_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,8,10,7,6,9,3,4,1,5};
        
        for(int i=0;i<a.length;i++)
        {
     	   for(int j=i+1;j<a.length;j++)
     	   {
     		   if(a[i]<a[j])//Ascending change the sign only
     		   {
     			   int b=a[i];
     			   a[i]=a[j];
     			   a[j]=b;
     		   }
     	   }
     	   System.out.print(a[i]+",");
     	   
        }
        System.out.print("second highest array is "+a[1]);
	}

}
