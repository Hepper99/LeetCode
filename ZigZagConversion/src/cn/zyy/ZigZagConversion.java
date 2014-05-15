package cn.zyy;

import java.util.Scanner;

class Solution {
    public String convert(String s, int nRows) {
        String text = "";
        if(nRows == 1)
        	return s;
        int step = 2 * nRows - 2; 
        for(int i=0;i<nRows;i++)
        {
        	if(i==0 || i==nRows-1)
        	{
        		int off = 0;
        		while(i + off < s.length())
        		{
        			text += s.charAt(i + off);
        			off += step;
        		}
        	}
        	else{
        		int off = 0;
        		while(i + off < s.length())
        		{
        			text += s.charAt(i + off);
        			off += step - 2 * i;
        			if(i + off < s.length())
        				text += s.charAt(i + off);
        			off += 2 * i;      				
        		}
        	}
        }
		return text;
    }
}
public class ZigZagConversion {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String s = sca.next();
		int n = sca.nextInt();
		Solution sol = new Solution();
		String text = sol.convert(s, n);
		System.out.println(text);
	}

}
