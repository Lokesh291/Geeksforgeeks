Sorting a Array
Code :
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("enter limit");
		int n =sc.nextInt();
		int a[] = new int[n];
		System.out.println("elements");
		for(int i=0;i<n;i++)
		{
    	    a[i] = sc.nextInt();
		}
	    int temp = 0;
	    for(int i = 0 ;i<n ; i++)
	    {
	        for(int j = i+1;j<n;j++)    //Important Part
	        {
	            if(a[i]>a[j])
	            {
	                temp = a[i] ;
	                a[i] = a[j] ;
	                a[j] = temp ;
	            }
	        }
	    }
// sort() method can be used complexity:O(n log(n))
//Accepts array : Int,float,char,double,long
//Import java.util.Arrays;
  Arrays.sort(arrayname);
  Arrays.sort(a);
	    for(int i =0;i<n;i++)
	    {
	        System.out.print(a[i] + " ");
	    }
    }
}

Process
i=0 j = 1  -->  5 4 3 2 1    -->  4 5 3 2 1
i=0 j = 2  -->  4 5 3 2 1    -->  3 5 4 2 1
i=0 j = 3  -->  3 5 4 2 1    -->  2 5 4 3 1
i=0 j = 4  -->  2 5 4 3 1    -->  1 5 4 3 2

These are the steps using for loop.
