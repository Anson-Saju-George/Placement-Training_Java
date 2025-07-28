//package Fundamentals;
import java.util.*;
public class _010_Isogram
{
	public static void main(String[] args)
	{
		Scanner  sc = new Scanner(System.in);
		String a = sc.nextLine();
		int i ,j,len;
		for(i=0;i<a.length() ; i++)
		{
		    if(a.charAt(i)!=' ')
		    for(j=i+1 ;j<a.length() ; j++)
		    {
		        if(a.charAt(i)==a.charAt(j))
		        {
		            
		            System.out.print(a.charAt(i)+" not isogram");
		            return ;
		        }
		    }
		}
		System.out.print("isogram");
		
	}
}