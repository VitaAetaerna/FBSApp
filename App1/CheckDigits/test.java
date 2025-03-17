import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class tests{

	@Test
	public static void TestDigitCounter(){
		var result = Main.GetDigitCount(1000);
		assertEquals(result, "Digit Count: 4");
	}

	@Test
	public static void TestCrossSum(){
		var result = Main.GetCrossSum(231);
		assertEquals(result, "Cross Sum: 6");
	}
}