import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class tests{
	public Reverser reverser = new Reverser();
	@Test
	public void TestWordHello(){
		var result = reverser.Reverse("Hello");
		assertEquals(result, "olleH");
	}
	@Test
	public void TestWordJava(){
		var result = reverser.Reverse("Java");
		assertEquals(result, "avaJ");
	}
	@Test
	public void TestWordCsharpFAIL(){
		var result = reverser.Reverse("Csharp");
		assertEquals(result, "prahCs");
	}
}