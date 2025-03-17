import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class tests{

	@Test
	public void MinGood(){
		int[] arr = {1, 2, 3, 4, 5, 6};
		var result = Main.Min(arr);
		assertEquals(result, 1);
	}


	@Test
	public void MinGood2(){
		int[] arr = {8, 7, 7, 5, 8};
		var result = Main.Min(arr);
		assertEquals(result, 5);
	}

	@Test
	public void MaxGood(){
		int[] arr = {1, 2, 3, 4, 5, 6};
		var result = Main.Max(arr);
		assertEquals(result, 6);
	}


	@Test
	public void MaxGood2(){
		int[] arr = {8, 7, 7, 5, 8};
		var result = Main.Max(arr);
		assertEquals(result, 8);
	}

	@Test
	public void AvgGood(){
		int[] arr = {1, 2, 3, 4, 5, 6};
		var result = Main.Avg(arr);
		assertEquals(result, 3);
	}


	@Test
	public void AvgGood2(){
		int[] arr = {8, 7, 7, 5, 8};
		var result = Main.Avg(arr);
		assertEquals(result, 7);
	}


		@Test
	public void Null(){
		int[] arr = {};
		var result = Main.Avg(arr);
		assertEquals(result, 0);
	}
}