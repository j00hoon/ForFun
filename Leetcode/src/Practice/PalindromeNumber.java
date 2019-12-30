package Practice;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int num = 10;
		System.out.println("Res : " + isPalindrome(num));
	}
	
	private static boolean isPalindrome(int num)
	{
		if(num < 0)
		{
			return false;
		}// if
		
		String str = Integer.toString(num);
		int i, j;
		
		if(str.length() % 2 == 0)
		{
			j = str.length() / 2;
			i = j - 1;
			
			while(0 <= i && j < str.length())
			{
				if(!str.substring(i, i + 1).equals(str.substring(j, j + 1)))
				{
					return false;
				}// if
				i--;
				j++;
			}// while
		}// if
		else
		{
			j = str.length() / 2 + 1;
			i = str.length() / 2 - 1;
			
			while(0 <= i && j < str.length())
			{
				if(!str.substring(i, i + 1).equals(str.substring(j, j + 1)))
				{
					return false;
				}// if
				i--;
				j++;
			}// while
		}// else
		
		return true;
	}

}
