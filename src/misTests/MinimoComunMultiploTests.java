package misTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.MinimoComunMultiplo;

class MinimoComunMultiploTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMinimoComunMultiplo() {
		MinimoComunMultiplo mcm = new MinimoComunMultiplo();
		int resultado=0;
		int[]candidatos= {6,8};
		assertEquals(resultado,0);
	}
	
	
}
