import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class tests{
    @Test
    public void OneTwoThree(){
        var result = Main.CheckOrder(1, 2,3);
        assertEquals(""+3+2+1, result);
    }

        @Test
    public void TwoOneThree(){
        var result = Main.CheckOrder(2,1,3);
        assertEquals(""+3+2+1, result);
    }

        @Test
    public void ThreeOneTwo(){
        var result = Main.CheckOrder(3, 1, 2);
        assertEquals(""+3+2+1, result);
    }

        @Test
    public void ThreeTwoOne(){
        var result = Main.CheckOrder(3,2,1);
        assertEquals(""+3+2+1, result);
    }

        @Test
    public void OneThreeTwo(){
        var result = Main.CheckOrder(1, 3,2);
        assertEquals(""+3+2+1, result);
    }
}
