public class ArrayHandler
{
	public int[][] CreateArray(int arraySize) {
		int value = 0; 	
		int[][] arr = new int[arraySize][arraySize];
			for (int y=0; y<arr[0].length; y++)
				for(int x=0; x<arr.length; x++){
					value++;
					arr[x][y] = value;
				}

		

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
		return arr;

	}

	public void AddArray(int[][] arr, int[][] arr2){
		for (int x=0; x<arr.length; x++){
			System.out.print("   X"+ x);
		}
			System.out.println("");

		for (int x=0; x<arr.length; x++){
			for (int y=0; y<arr[x].length; y++){
				System.out.print("   "+arr[x][y] * arr2[x][y] +" ");
			}
			System.out.println("");
		} 	
	}
}