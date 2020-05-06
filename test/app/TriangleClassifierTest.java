package app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

	@Test
	void getTypeTriangle1() {
		String test = TriangleClassifier.getTypeTriangle(4,4,5);
		assertEquals(TriangleClassifier.TAM_GIAC_CAN, test);
	}

	@Test
	void getTypeTriangle2() {
		String test = TriangleClassifier.getTypeTriangle(6,7,8);
		assertEquals(TriangleClassifier.TAM_GIAC_THUONG, test);
	}

	@Test
	void getTypeTriangle3() {
		String test = TriangleClassifier.getTypeTriangle(3,4,5);
		assertEquals(TriangleClassifier.TAM_GIAC_VUONG, test);
	}
}
