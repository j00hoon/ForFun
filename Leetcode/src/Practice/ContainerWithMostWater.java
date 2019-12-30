package Practice;

public class ContainerWithMostWater 
{
	public static void main(String[] args) 
	{
		int input[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println("Res : " + maxArea(input));
	}
	
	private static int maxArea(int height[])
	{
		int max = 0, tmp = 0;
		
		for(int i = 0; i < height.length - 1; i++)
		{
			for(int j = i + 1; j < height.length; j++)
			{
				if(height[i] > height[j])
				{
					tmp = height[j] * (j - i);
				}// if
				else
				{
					tmp = height[i] * (j - i);
				}// else
				if(tmp > max)
				{
					max = tmp;
				}// if
			}// for
		}// for
		return max;
	}

}
