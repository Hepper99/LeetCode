package cn.zyy;

import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
    	if(x < 0)
    		return false;
        int divisor = 1;
        while(x / divisor >= 10)
        	divisor *= 10;
        int h = divisor;
        int l = 10;
        while(h >= l)
        {
        	if(x / h != x % l)
        		return false;
        	x %= h;
        	x /= l;
        	h /= 100;
        }
        return true;
    }
}

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		Solution sol = new Solution();
		System.out.println(sol.isPalindrome(n));
	}

}
