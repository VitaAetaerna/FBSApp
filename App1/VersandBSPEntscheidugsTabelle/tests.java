import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class tests{

	@Test
	public void Unter150(){
		var result = Main.VersandBerechnen(100);
		assertEquals(result, "8");
	}

	@Test
	public void Unter300Ueber150() {
		var result = Main.VersandBerechnen(175);
		assertEquals(result, "Zwischen 150 und 300");
	}

	@Test
	public void Ueber300(){
		var result = Main.VersandBerechnen(350);
		assertEquals(result, "Geschenk");
	}

	@Test
	public void Ist150(){
		var result = Main.VersandBerechnen(150);
		assertEquals(result, "8");
	}

		@Test
	public void Ist300(){
		var result = Main.VersandBerechnen(300);
		assertEquals(result, "Zwischen 150 und 300");
	}
}