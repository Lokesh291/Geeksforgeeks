Print first n Fibonacci 

class Solution
{
    
    public static long[] printFibb(int n) 
    {
        
        long arr[] = new long[n];
        arr[0] = 1 ;
        if(n==1)
        {
            return arr;
        }
        arr[1] = 1 ;
        if(n == 2)
        {
            return arr;
        }
        for(int i =2;i<n;i++)
        {
            arr[i] = (arr[i-1] + arr[i-2]);

        }
        return arr;
        
    }
}
