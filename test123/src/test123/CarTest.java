package test123;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car mycar;
	@Before
	public void setUp() throws Exception {
		mycar= new Car(100);
	}

	@Test
	public void test() {
		mycar.addcap(100);
		assertEquals(200,mycar.getCapacity());
	}

}
