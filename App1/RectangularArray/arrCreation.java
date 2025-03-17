import java.util.Random;
public class arrCreation{
	final int arrLength = 4;
	final int arrItemLength = 4;

	public int[][] arr = new int[arrLength][arrItemLength];

	private Random _rand = new Random();


		public arrCreation(){
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++){
				arr[i][j] = this._rand.nextInt(11);
			}
		}
	}


	public void PrintArray(){
		for (int x=0; x<arr.length; x++){
			System.out.print("   X"+ x);
		}
			System.out.println("");

		for (int x=0; x<arr.length; x++){
			for (int y=0; y<arr[x].length; y++){
				System.out.print("   "+arr[x][y]+" ");
			}
			System.out.println("");
		}


		}
}