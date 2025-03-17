import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class tests{
	@Test
	public void ArrayCrossSum(){
		int[] tmp ={10, 11, 12, 13, 14};
		var result = Main.ArrayCrossSum(tmp);
		assertEquals(result, 60);
	}
}
