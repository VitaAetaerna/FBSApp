public class ArrayHandlerTest {
    public int[][] sumArray(int[][] arr, int[][] arr2 ){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = arr[i][j] * arr2[i][j];
            }
        }
        return arr;
    }

    public int sumDiagonalsLR(int[][] arr){
        int LR = 0;
        for (int i=0; i<arr.length; i++){
            LR = LR + arr[i][i];
        }
        return LR;
    }

    public int sumDiagonalsRL(int[][] arr){
        int RL = 0;


        for (int i=0; i<arr.length ; i++){
            System.out.println(arr[i][arr[0].length - 1 - i]);
            RL = RL + arr[i][arr[0].length - 1 - i];
        }
        return RL;

    }
}
