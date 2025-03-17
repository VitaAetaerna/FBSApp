import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class tests{

    @Test
    public void LustUndAS(){
        String aktion1 = "Geht Ganz";
        var result = Main.getAction(Boolean.TRUE, Boolean.TRUE, null);
        assertEquals(result, aktion1);
    }


    
    @Test
    public   void LustUndKeineAS(){
		String aktion2 = "Geht Pause";
        var result = Main.getAction(Boolean.TRUE, Boolean.FALSE, null);
        assertEquals(result, aktion2);
    }


    @Test
    public  void KeineLustUndNichtPruefung(){
    	String aktion3 = "Geht Nicht";
        var result = Main.getAction(Boolean.FALSE, null, Boolean.FALSE);
        assertEquals(result, aktion3);
    }


    @Test
    public   void KeineLustUndAsUndPruefung(){
        String aktion1 = "Geht Ganz";

        var result = Main.getAction(Boolean.FALSE, Boolean.TRUE, Boolean.TRUE);
        assertEquals(result, aktion1);
    }


    @Test
    public   void KeineLustUndKeineAsUndPruefung(){
        String aktion2 = "Geht Pause";
        var result = Main.getAction(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE);
        assertEquals(result, aktion2);
    }

        @Test
    public   void Hallo(){
        String aktion4 = "Hallo!";
        var result = Main.getAction(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE);
        assertEquals(result, aktion4);
    }

}