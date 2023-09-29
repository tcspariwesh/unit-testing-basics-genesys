import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathsTest {
	Maths maths;

	@BeforeEach
	void setup() {
		maths = new Maths();
		System.out.println("setup");
	}

	@Test
	void testAdd() {
		// Arrange
		int result = maths.add(2, 3); // act
		assertEquals(5, result); // assert
	}

	@Test
	void testAddWithZero() {
		// Arrange
		int result1 = maths.add(0, 3); // act
		assertEquals(3, result1); // assert
	}

	@Test
	void testAddThrowsException() {
		// Arrange
		assertThrows(RuntimeException.class, () -> {
			maths.add(5, 3);
		});
	}
}
