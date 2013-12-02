import static org.junit.Assert.*;

import org.junit.Test;


public class ContIntTest {

	@Test
	public void testSum() {
		ContInt tester = new ContInt();
	    assertEquals("10 + 5 must be 15", 15, tester.sum(10, 5));
	}

	@Test
	public void testName(){
		ContInt tester = new ContInt();
		tester.setName("Jenkins");
		assertEquals("Name must be Jenkins", "Jenkins", tester.getName());
		
	}
}