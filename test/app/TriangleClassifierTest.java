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
		String test = TriangleClassifier.getTypeTriangle(2,2,2);
		assertEquals(TriangleClassifier.TAM_GIAC_DEU, test);
	}

	@Test
	void getTypeTriangle4() {
		String test = TriangleClassifier.getTypeTriangle(2,2,3);
		assertEquals(TriangleClassifier.TAM_GIAC_CAN, test);
	}

	@Test
	void getTypeTriangle5() {
		String test = TriangleClassifier.getTypeTriangle(3,4,5);
		assertEquals(TriangleClassifier.TAM_GIAC_THUONG, test);
	}

	@Test
	void getTypeTriangle6() {
		String test = TriangleClassifier.getTypeTriangle(8,2,3);
		assertEquals(TriangleClassifier.NOT_TRIANGLE, test);
	}

	@Test
	void getTypeTriangle7() {
		String test = TriangleClassifier.getTypeTriangle(-1,2,1);
		assertEquals(TriangleClassifier.NOT_TRIANGLE, test);
	}

	@Test
	void getTypeTriangle8() {
		String test = TriangleClassifier.getTypeTriangle(0,1,1);
		assertEquals(TriangleClassifier.NOT_TRIANGLE, test);
	}
}
