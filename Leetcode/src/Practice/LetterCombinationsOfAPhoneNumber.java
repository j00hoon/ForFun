package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber 
{
	public static void main(String[] args) 
	{
		String str = "23";
		List<String> list = new ArrayList<>();
		
		list = letterCombinations(str);
		System.out.println("Res : " + list);
	}
	
	private static List<String> letterCombinations(String str)
	{
		Map<Object, ArrayList<Object>> map = new HashMap<>();		
		
		ArrayList<Object> tmpObj1 = new ArrayList<>();
		tmpObj1.add("");
		map.put(1, tmpObj1);
		
		ArrayList<Object> tmpObj2 = new ArrayList<>();
		tmpObj2.add("a");
		map.put(2, tmpObj2);
		tmpObj2.add("b");
		map.put(2, tmpObj2);
		tmpObj2.add("c");
		map.put(2, tmpObj2);
		
		ArrayList<Object> tmpObj3 = new ArrayList<>();
		tmpObj3.add("d");
		map.put(3, tmpObj3);
		tmpObj3.add("e");
		map.put(3, tmpObj3);
		tmpObj3.add("f");
		map.put(3, tmpObj3);
		
		ArrayList<Object> tmpObj4 = new ArrayList<>();
		tmpObj4.add("g");
		map.put(4, tmpObj4);
		tmpObj4.add("h");
		map.put(4, tmpObj4);
		tmpObj4.add("i");
		map.put(4, tmpObj4);
		
		ArrayList<Object> tmpObj5 = new ArrayList<>();
		tmpObj5.add("j");
		map.put(5, tmpObj5);
		tmpObj5.add("k");
		map.put(5, tmpObj5);
		tmpObj5.add("l");
		map.put(5, tmpObj5);
		
		ArrayList<Object> tmpObj6 = new ArrayList<>();
		tmpObj6.add("m");
		map.put(6, tmpObj6);
		tmpObj6.add("n");
		map.put(6, tmpObj6);
		tmpObj6.add("o");
		map.put(6, tmpObj6);
		
		ArrayList<Object> tmpObj7 = new ArrayList<>();
		tmpObj7.add("p");
		map.put(7, tmpObj7);
		tmpObj7.add("q");
		map.put(7, tmpObj7);
		tmpObj7.add("r");
		map.put(7, tmpObj7);
		tmpObj7.add("s");
		map.put(7, tmpObj7);
		
		ArrayList<Object> tmpObj8 = new ArrayList<>();
		tmpObj8.add("t");
		map.put(8, tmpObj8);
		tmpObj8.add("u");
		map.put(8, tmpObj8);
		tmpObj8.add("v");
		map.put(8, tmpObj8);
		
		ArrayList<Object> tmpObj9 = new ArrayList<>();
		tmpObj9.add("w");
		map.put(9, tmpObj9);
		tmpObj9.add("x");
		map.put(9, tmpObj9);
		tmpObj9.add("y");
		map.put(9, tmpObj9);
		tmpObj9.add("z");
		map.put(9, tmpObj9);
		
		
		Map<Integer, String> map2 = new HashMap<>();	
		int mapSize = 0;
		List<String> list = new ArrayList<>();
		String tmpStr = "";
		int num = Integer.parseInt(str);
		int i = 0, j = 0;
		
		while(num % 10 != 0)
		{
			int tmp = num / 10;
			num = num % 10;
			
			if(tmp != 0)
			{
				while(i < map.get(tmp).size())
				{
					tmpStr += (String) map.get(tmp).get(i);
					i++;
				}// while
			}// if
			else
			{
				while(i < map.get(num).size())
				{
					tmpStr += (String) map.get(num).get(i);
					i++;
				}// while
				num = 0;
			}// else	
			map2.put(mapSize, tmpStr);
			tmpStr = "";
			i = 0;
			j = 0;			
			mapSize++;
		}// while
		
		System.out.println(map2.size());
		System.out.println(map2.get(0).length());
		System.out.println(map2.get(0).charAt(0));
		
		int map2Size = 0;
		int i2 = 0;
		
		while(map2Size < map2.size())
		{
			while(i2 < map2.get(i2).length())
			{
				
			}// while
			
		}// while		
		
		return list;
	}

}
