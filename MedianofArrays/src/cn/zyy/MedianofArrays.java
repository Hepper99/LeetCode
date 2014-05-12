package cn.zyy;

import java.util.Scanner;


class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
    	int sizeA = A.length;
    	int sizeB = B.length;
    	if((sizeA+sizeB)%2 == 0)
    		return (find(A,0,B,0,(sizeA+sizeB)/2)+find(A,0,B,0,(sizeA+sizeB)/2 + 1))/2;
    	else
    		return find(A,0,B,0,(sizeA+sizeB)/2 + 1);
    }
    public double find(int A[], int astart, int B[], int bstart, int k)
    {
    	int m = A.length-astart;
    	int n = B.length-bstart;
    	if(m > n)
    		return find(B,bstart,A,astart,k);
    	if(astart > A.length-1)
    		return B[bstart+k-1];
    	if(bstart > B.length-1)
    		return A[astart+k-1];
    	if(k == 1)
    		return A[astart]<B[bstart]?A[astart]:B[bstart]; 
    	int pa = k/2<m?k/2:m;
    	int pb = k - pa;
    	if(A[astart + pa - 1] < B[bstart + pb - 1])
    		return find(A,astart+pa,B,bstart,k - pa);
    	else if(A[astart + pa - 1] > B[bstart + pb - 1])
    		return find(A,astart,B,bstart+pb,k-pb);
    	else
    		return A[astart + pa - 1];
    	
    }
}

public class MedianofArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int n;
		n = s.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++)
			A[i] = s.nextInt();
		int m = s.nextInt();
		int[] B = new int[m];
		for(int i=0;i<m;i++)
			B[i] = s.nextInt();
		Solution sol = new Solution();
		double mid = sol.findMedianSortedArrays(A,B);
		System.out.println(mid);
	}

}
