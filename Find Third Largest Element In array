Third Largest Number in array
Basic Level
Sort array and print the largest number
Code :

class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n<3)
	    {
	        return -1;
	    }
	    else
	    {
	    int temp = 0;
	    for(int i = 0 ;i<n ; i++)
	    {
	        for(int j = i+1;j<n;j++)
	        {
	            if(a[i]>a[j])
	            {
	                temp = a[i] ;
	                a[i] = a[j] ;
	                a[j] = temp ;
	            }
	        }
	    }
	    int Third = a[n-3];
	    return Third;
	    }
    }
}
