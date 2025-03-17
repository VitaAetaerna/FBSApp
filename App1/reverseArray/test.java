public class tests {
    @Test
    public void reverseArray() {
        int [] arr = new int[] {1,2,3,4,5,6,7,8,9};
        new JaggedArray().reverseArray(arr);
        assertArrayEquals(new int[] {9,8,7,6,5,4,3,2,1},arr);
    
}
