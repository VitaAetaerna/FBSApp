  import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class tests{
    @Test
    public void testNumbers(){
        var result = Main.CheckOrder(1, 2, 3);
        assertEquals(result, ""+3+2+1);
    }

        @Test
        public void testNumbersTwo(){
        var result = Main.CheckOrder(2, 1, 3);
        assertEquals(result, ""+3+2+1);
        }


        @Test

        public void testNumbersThree(){
        var result = Main.CheckOrder(3, 2, 1);
        assertEquals(result, ""+3+2+1);
    }    
   
    @Test
        public void testNumbersFour(){
        var result = Main.CheckOrder(1, 3, 2);
        assertEquals(result, ""+3+2+1);
    }
    }
