// package Fundamentals;
import java.util.*;
public class _018_Array_Insertion
{
	public static void main(String[] args) 
	{
	      Scanner sc = new Scanner(System.in);
	      int size = sc.nextInt();        //   size  
	      int a[] = new int[size];        //   array declaration & initial 
	      int b[] = new int[size+1];
	      int i ,pos ,data;
	      for(i=0;i<size ; i++)
	      {
	         a[i] = sc.nextInt();         //   data 
	      }
	      data = sc.nextInt();  
	        pos = sc.nextInt();  
	      
	      int j;
	      for(i=0 , j = 0;j<=size;     )
	      {
	          if(j == pos-1)  //  3 == 3 
	          {
	              b[i] = data;
	              j++;
	          }
	          else
	          {
	          b[j] = a[i];
	          i++;
	          j++;
	          }
	      }
	      
	      
	      
	      
	       for(i=0;i<=size ; i++)    //  traversal 
	      {
	        System.out.print(b[i]+" ");
	      }
	    sc.close();
     
	}
}