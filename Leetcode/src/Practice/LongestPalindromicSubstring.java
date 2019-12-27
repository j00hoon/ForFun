package Practice;

public class LongestPalindromicSubstring 
{
	public static void main(String[] args) 
	{
		String str = "cbbd";
		System.out.println("Res : " + LongestPalindromicSubString(str));
	}
	
	private static String LongestPalindromicSubString(String str)
	{
		char arr[] = str.toCharArray();
		String res = "", tmp = "";
		boolean flag = true;
		
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i; j < str.length(); j++)
			{
				if(arr[i] == arr[j])
				{
					int k = i + 1, l = j - 1;
					while(k <= l)
					{
						if(arr[k] == arr[l])
						{
							k++;
							l--;
						}// if
						else
						{
							flag = false;
							break;
						}// else
					}// while
					if(flag)
					{
						tmp = str.substring(i, j + 1);							
					}// if
					else
					{
						flag = true;
					}// else
				}// if
			}// for
			if(tmp.length() >= res.length())
			{
				res = tmp;
			}// if
			tmp = "";
		}// for
		return res;	   
	}
}
