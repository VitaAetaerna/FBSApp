import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class test{
    @Test
    public void sumTwo2DArraysEqual() {
        assertArrayEquals(new int[][] { { 1, 4 }, { 9, 16 } }, new ArrayHandlerTest()
                        .sumArray(new int[][] { { 1, 2 }, { 3, 4 } }, new int[][] { { 1, 2 }, { 3, 4 } }));
    }

    @Test
    public void sumDiagLR(){
        assertEquals(20, new ArrayHandlerTest().sumDiagonalsLR(new int[][] { { 2, 4,10, 2}, {3, 6, 2, 3}, {4,7,4,4}, {5,8,1,8}}));
    }

 @Test
    public void sumDiagRL(){
        assertEquals(16, new ArrayHandlerTest().sumDiagonalsRL(new int[][] { { 2, 4,10, 2}, {3, 6, 2, 3}, {4,7,4,4}, {5,8,1,8}}));
    }

}