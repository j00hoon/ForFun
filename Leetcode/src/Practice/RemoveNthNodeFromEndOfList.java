package Practice;

import java.util.LinkedList;
import java.util.List;

public class RemoveNthNodeFromEndOfList 
{

	public static void main(String[] args) 
	{
//		List<Integer> list = new LinkedList<>();
//		int num = 2;
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		
//		list = removeNthFromEnd(list, num);
//		System.out.println(list);
		
		int num = 2;
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ln1.setNext(ln2);
		ListNode ln3 = new ListNode(3);
		ln2.setNext(ln3);
//		ListNode ln4 = new ListNode(4);
//		ln3.setNext(ln4);
//		ListNode ln5 = new ListNode(5);
//		ln4.setNext(ln5);
		
		
		ln1 = removeNthFromEnd(ln1, num);
		
		while(ln1 != null)
		{
			System.out.print(ln1.getVal());
			ln1 = ln1.getNext();
			if(ln1 != null)
			{
				System.out.print(" -> ");
			}// if
		}// while
		
	}
	
	private static ListNode removeNthFromEnd(ListNode ln, int n)
	{
		int i = 0, size = 0;
		ListNode tmp = new ListNode(ln.getVal());
		tmp = ln;
		
		while(tmp != null)
		{
			size++;		
			tmp = tmp.getNext();
		}// while
		
		if(n > size)
		{
			return null;
		}// if
		
		tmp = ln;
			
		if(n == 1)
		{
			if(size == 1)
			{
				return null;
			}// if
			while(i < size)
			{
				if(i == size - 2)
				{
					tmp.setNext(null);
					break;
				}// if
				tmp = tmp.getNext();
				i++;
			}// while
		}// if
		else if(n == size)
		{
			tmp = tmp.getNext();
			ln = tmp;
		}// else if
		else
		{
			while(i <= size - n)
			{
				if(i == size - n - 1)
				{
					tmp.setNext(tmp.getNext().getNext());
					break;
				}// if
				else
				{
					tmp = tmp.getNext();
				}// else
				i++;
			}// while
		}// else
		
		return ln;
	}
	
//	private static List<Integer> removeNthFromEnd(List<Integer> list, int n)
//	{
//		if(n > list.size() - 1)
//		{
//			return null;
//		}// if
//		
//		int i = list.size();
//		int j = 0;
//		
//		while(j < n)
//		{
//			i--;
//			j++;
//			if(j == n)
//			{
//				list.remove(i);
//			}// if
//		}// while			
//			
//		return list;
//	}

}