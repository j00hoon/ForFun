package Practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter 
{
	public static void main(String[] args) 
	{
		String str = "dvdf";
		System.out.println("res : " + LongestSubstring(str));
	}
	
	private static int LongestSubstring(String str)
	{
		Set<String> set = new HashSet<>();
		int len = str.length();
		int max = 0, i = 0, j = 0;
		
		if(str == "")
		{
			return max;
		}// if
		
		while(i < len && j < len)
		{
			if(!set.contains(str.substring(j, j + 1)))
			{
				//System.out.println(str.substring(j, j + 1));
				set.add(str.substring(j, j + 1));
				j++;
				max = Math.max(max, j - i);
			}// if
			else
			{
				set.remove(str.substring(i, i + 1));
				i++;
			}// else
		}// while
		
		return max;		
	}

}
