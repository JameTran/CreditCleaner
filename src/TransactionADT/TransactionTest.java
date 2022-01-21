package transaction_adt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransactionTest {
	String[] test1 = {"a", "b"};
	Transaction test = new Transaction(3.0, 1, 2222.22, test1);
	
	
	
	
	@Test
	public void testTime() {
		assert test.getTime() == 3.0;
	}
	
	@Test
	public void testFraud() {
		assert test.getFraud() == 1;
	}
	
	@Test 
	public void testAmount() {
		assert test.getAmount() == 2222.22;
	}
	
	@Test
	public void testEncrypt1() {
		assert test.getEncrypted()[0] == "a";   
	}
	
	@Test
	public void testEncrypt2() {
		assert test.getEncrypted()[1] == "b";
	}
	
}
