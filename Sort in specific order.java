//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        Arrays.sort(arr);
        ArrayList<Long> eve=new ArrayList<>();
        ArrayList<Long> odd=new ArrayList<>();
        for(long i:arr){
            if(i%2==0){
                eve.add(i);
            }
            else{
                odd.add(i);
            }
        }
        Collections.reverse(odd);
        int c=0;
        for(int i=0;i<odd.size();i++){
            // System.out.print(odd.get(i)+" odd ");
            arr[i]=odd.get(i);
            c++;
        }
        // int j=0;
        for(int i=0;i<eve.size();i++){
            // System.out.print(eve.get(i)+" eve ");
            arr[c]=eve.get(i);
            c++;
            
        }
    }
}
