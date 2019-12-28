package Practice;

public class ReverseInteger 
{
	public static void main(String[] args) 
	{
		int num = 12123;
		System.out.println("Res : " + reverse(num));
	}
	
	private static int reverse(int num)
	{
		int tmp = num;
		if(tmp < 0)
		{
			tmp = tmp * -1;
		}// if
		
		String str = Integer.toString(tmp);
		String str2 = "";
		int res = 0;
		
		for(int i = str.length(); i > 0; i--)
		{
			str2 += str.substring(i - 1, i);
		}// for
		
		res = Integer.parseInt(str2);
		if(num < 0)
		{
			res = res * -1;
		}// if
		
		return res;
	}
	
}
