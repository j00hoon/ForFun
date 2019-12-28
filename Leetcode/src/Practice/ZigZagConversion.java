package Practice;

import java.util.Arrays;

public class ZigZagConversion 
{
	public static void main(String[] args) 
	{
		String str = "PAYPALISHIRING";
		int num = 3;
		
		System.out.println(ZigZagConversion(str, num));
	}
	
	
	private static String ZigZagConversion(String str, int num)
	{
		if(num == 1)
		{
			return str;
		}// if
		
		char charArr[] = str.toCharArray();
		int len = str.length();
		
		String strArr[] = new String[num];
		Arrays.fill(strArr, "");
		
		String res = "";
		int row = 0;
		boolean down = true;
		
		for(int i = 0; i < len; i++)
		{
			strArr[row] += charArr[i];
			
			if(row == num - 1)
			{
				down = false;
			}// if
			else if(row == 0)
			{
				down = true;
			}// else if
			
			if(down)
			{
				row++;
			}// if
			else
			{
				row--;
			}// else
		}// for
		
		for(int i = 0; i < num; i++)
		{
			res += strArr[i];
		}// for
		
		return res;		
	}
}
