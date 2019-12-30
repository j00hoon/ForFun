package Practice;

public class LongestCommonPrefix 
{
	public static void main(String[] args) 
	{
		String str[] = {"ca", "a"};
		System.out.println("Res : " + longestCommonPrefix(str));
	}
	
	private static String longestCommonPrefix(String str[])
	{
		String tmp = "", res = "";
		int len = 1, cnt = 0, lenPrefix = 0, flag = 0;
		
		if(str.length == 0)
		{
			return "";
		}// if
					
		for(int i = 0; i < str[0].length(); i++)
		{
			for(int j = i + 1; j <= str[0].length(); j++)
			{
				tmp = str[0].substring(i, j);
				cnt = tmp.length();
				
				while(len < str.length)
				{
					if(!str[len].contains(tmp))
					{
						flag++;
					}// if
					len++;
				}// while
				
				if(flag == 0)
				{
					if(cnt >= lenPrefix)
					{
						lenPrefix = cnt;
						res = tmp;
					}
				}// if
				flag = 0;
				len = 1;
			}// for				
		}// for
		
		return res;
	}

}
