import java.util.*;
import java.lang.Integer;

public class BinarySearcher 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BinarySearcher binary = new BinarySearcher();
		
		int[] numberList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		binary.BinarySearch(numberList, 4);
	}
	
	Integer BinarySearch(int[] numberList, int item)
	{	
		int low = 0;
		int high = numberList.length - 1;
		
		while(low <= high) 
		{
			int mid = (low + high) / 2;
			
			if(numberList[mid] == item) 
			{
				System.out.printf("The item's position is %s°", mid);
				return mid;
			}
			
			else if(numberList[mid] > item) 
			{
				high = mid - 1;
			}
			
			else
				low = mid + 1;
		}
		return null;
	}

}
