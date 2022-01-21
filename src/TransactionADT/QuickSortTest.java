package TransactionADT;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;
public class QuickSortTest {

	@Before
	public void setUp() throws Exception {
		Transaction[] testList = new Transaction[10];
		Random rand = new Random();
		for(int i = 0; i < testList.length; i++)
		{
			Transaction testTransaction = new Transaction((double)rand.nextInt(50), rand.nextInt(2), (double) rand.nextInt(20001),null);
			testList[i] = testTransaction;
		}
	}
	private boolean isAscendingAmount(Transaction[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i == (a.length - 1))
			{
				return true;
			}
			if(a[i].getAmount() > a[i+1].getAmount())
			{
				return false;
			}
		}
		return true;
	}
	
	
	private boolean isAscendingTime(Transaction[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i == (a.length - 1))
			{
				return true;
			}
			if(a[i].getTime() > a[i+1].getTime())
			{
				return false;
			}
		}
		return true;
	}
	
	
	private boolean isAscendingFraud(Transaction[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i == (a.length - 1))
			{
				return true;
			}
			if(a[i].getFraud() > a[i+1].getFraud())
			{
				return false;
			}
		}
		return true;
	}
	
	private boolean isDescendingAmount(Transaction[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i == (a.length - 1))
			{
				return true;
			}
			if(a[i].getAmount() < a[i+1].getAmount())
			{
				return false;
			}
		}
	}
	
	
	private boolean isDescendingTime(Transaction[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i == (a.length - 1))
			{
				return true;
			}
			if(a[i].getTime() < a[i+1].getTime())
			{
				return false;
			}
		}
	}
	private boolean isDescendingFraud(Transaction[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(i == (a.length - 1))
			{
				return true;
			}
			if(a[i].getFraud() < a[i+1].getFraud())
			{
				return false;
			}
		}
	}
	
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		QuickSort.sort(testList, "a", 0);
		assertTrue(isAscendingTime(testList));
		
		QuickSort.sort(testList, "a", 1);
		assertTrue(isAscendingAmount(testList));
		
		QuickSort.sort(testList, "a", 2);
		assertTrue(isAscendingFraud(testList));
		
		QuickSort.sort(testList, "d", 0);
		assertTrue(isDescendingTime(testList));
		
		QuickSort.sort(testList, "d", 1);
		assertTrue(isDescendingAmount(testList));
		
		QuickSort.sort(testList, "d", 2);
		assertTrue(isDescendingFraud(testList));	
	}

}
