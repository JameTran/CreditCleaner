package TransactionADT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SearchTest {
	private static Transaction[] Transactions ;
 
	@Before
	public void setUp() throws Exception {
		Transactions = transactionFile.readFile();
	}

	@Test
	public void AmountTest() {
		System.out.println("Amount");
		QuickSort.sort(Transactions, "a", 1);
		boolean found1 = BinarySearch.binarySearchAmount(Transactions, 149.62, "a");
		assert(found1);
		QuickSort.sort(Transactions, "d", 1);
		boolean found2 = BinarySearch.binarySearchAmount(Transactions, 61796, "d");
		assert(found2 == false);
		
	}
	
	@Test
	public void FraudTest() {
		System.out.println("Fraud");
		QuickSort.sort(Transactions, "a", 2);
		boolean found1 = BinarySearch.binarySearchFraud(Transactions, 0, "a");
		assert(found1);
		QuickSort.sort(Transactions, "d", 2);
		boolean found2 = BinarySearch.binarySearchFraud(Transactions, 1, "d");
		assert(found2);
	}
	
	@Test
	public void TimeTest() {
		System.out.println("Time");
		QuickSort.sort(Transactions, "a", 0);
		boolean found1 = BinarySearch.binarySearchTime(Transactions, 3, "a");
		assert(found1 == false);
		QuickSort.sort(Transactions, "d", 0);
		boolean found2 = BinarySearch.binarySearchTime(Transactions, 23, "d");
		assert(found2);
	}
	
	

}
