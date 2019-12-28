package Practice;

public class StringToInteger 
{
	public static void main(String[] args) 
	{
		String str = " awdasd asdasd 143";
		System.out.println("Res : " + myAtoi(str));
	}
	
	private static int myAtoi(String str)
	{
		str = str.replaceAll("\\s", ""); // Remove any spaces
		char arr[] = str.toCharArray();
		String tmp = "";
		
		
		if(str.equals(""))
		{
			System.out.println("Null");
			return 0;
		}// if
		else if('0' > arr[0] || '9' < arr[0])
		{
			if(arr[0] == '-' || arr[0] == '+')
			{
				tmp += arr[0];
				for(int i = 1; i < arr.length; i++)
				{
					if('0' <= arr[i] && arr[i] <= '9')
					{
						tmp += arr[i];
					}// if
				}// for
				System.out.println("The first letter is " + arr[0]);
				return Integer.parseInt(tmp);
			}// if
			else
			{
				return 0;
			}// else
		}// else if
		else 
		{
			for(int i = 0; i < arr.length; i++)
			{
				if('0' <= arr[i] && arr[i] <= '9')
				{
					tmp += arr[i];
				}// if
			}// for
			return Integer.parseInt(tmp);
		}// else
	}
}
