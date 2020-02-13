import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculadora {

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
	void testSuma() {
		assertEquals(4, Calculadora.suma(2,2));
	}
	
	@Test
	void testResta() {
		assertEquals(0, Calculadora.resta(2,2));

	}

	@Test
	void testMultiplicar() {
		assertEquals(2, Calculadora.multiplicar(2,1));

	}
	
	@Test
	void testResto() {
		assertEquals(0, Calculadora.resto(2,2));

	}

}
