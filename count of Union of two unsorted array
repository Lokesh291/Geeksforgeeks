Count of Union of two unsorted Array
Basic Level
Code:
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
        HashSet<Integer> Union = new HashSet<Integer>(); //Hashset only allows unique numbers //ArrayList adds both arrays
        int i = 0;
        int j =0;
        while(i<n)
        {
            Union.add(a[i]);
            i++;
        }
        while(j<m)
        {
            Union.add(b[j]);
            j++;
        }
        int s = Union.size();
        return s ;
    }
}
