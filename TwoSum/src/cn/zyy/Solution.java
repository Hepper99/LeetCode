package cn.zyy;

import java.util.Scanner;

public class Solution {
	private int[] index;
    public int[] twoSum(int[] numbers, int target) {
    	index = new int[numbers.length];
    	for(int i=0;i<numbers.length;i++)
    		index[i] = i;
    	int[] res = new int[2]; 
        qsort(numbers,0,numbers.length-1);
        int h = 0;
        int t = numbers.length-1;
        while(h <= t)
        {
        	if(numbers[h] + numbers[t] < target)
        		h++;
        	else if(numbers[h] + numbers[t] > target)
        		t--;
        	else{
        		res[0] = index[h]<index[t]?index[h]+1:index[t]+1;
        		res[1] = index[h]<index[t]?index[t]+1:index[h]+1;
        		return res;
        	}
        }
        return res;
    }
    
    public void qsort(int[] numbers, int start, int end)
    {
    	if(start<end)
    	{
    		int temp = numbers[(start+end)/2];
    		numbers[(start+end)/2] = numbers[end];
    		numbers[end] = temp;
    		temp = index[(start+end)/2];
    		index[(start+end)/2] = index[end];
    		index[end] = temp;
    		int key = numbers[end];
    		int i = start;
    		for(int j=start;j<end;j++)
    		{
    			if(numbers[j] < key)
    			{
    				temp = index[i];
    				index[i] = index[j];
    				index[j] = temp;
    				temp = numbers[i];
    				numbers[i] = numbers[j];
    				numbers[j] = temp;
    				i++;
    			}
    		}
    		temp = numbers[i];
    		numbers[i] = key;
    		numbers[end] = temp;
    		temp = index[i];
    		index[i] = index[end];
    		index[end] = temp;
    		qsort(numbers,start,i-1);
    		qsort(numbers,i+1,end);
    	}
    }
}

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);		
//		int n;
//		n = s.nextInt();
//		int[] numbers = new int[n];
//		for(int i=0;i<n;i++)
//			numbers[i] = s.nextInt();
//		int target = s.nextInt();
//		Solution sol = new Solution();
//		int[] res = sol.twoSum(numbers,target);
//		for(int i=0;i<res.length;i++)
//			System.out.println(res[i]);
		StringBuilder sb = new StringBuilder();
		sb.append("sss"); 
		sb.append("bbb");
		System.out.print(sb.toString());
	}		
}
