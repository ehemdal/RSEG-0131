// Sample JUnit 5 example extended from, and updated for JUnit 5 
// https://www.springboottutorial.com/junit-tutorial-for-beginners
// Notice the JUnit 5 does not import from junit.test

// For all assertions, see https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mymathtest {
	mymath myMath = new mymath();

	@BeforeEach
	public void setup_tests() {
		System.out.println("setup_tests: This code runs before each test");
	}

	@AfterEach
	public void teardown_tests() {
		System.out.println("teardown_tests: This code runs after each test");
	}

	@BeforeAll
	public static void setup_all() {
		System.out.println("setup_all: This code runs before all tests");
	}

	@AfterAll
	public static void teardown_all() {
		System.out.println("teardown_all: This code runs after all tests");
	}
	// MyMath.sum
	// Test the sum method by adding 1+2+3
	// Pass if the return value equals 6
	// 1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		System.out.println("sum_with3numbers");
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}
	// Test the sum method works when only one integer is provided
	// Pass if the returned sum equals the provided value
	@Test
	public void sum_with1number() {
		System.out.println("sum_with1number");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}
	// Test the average method by averaging integers {1,2,3}
	// Pass if the average equals 2
	@Test
	public void test_average() {
		System.out.println("test_average");
		assertEquals(2, myMath.avg(new int[] {1, 2, 3}));
	}
}
