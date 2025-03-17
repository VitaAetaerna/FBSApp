class Main{
	public static void main(String[] args){
		ArrayCrossSum(FillArray(5));
	}

	public static int[] FillArray(int ArrayStart){
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++){
			arr[i] = ArrayStart + i; 
		}

		for (int item: arr){
			System.out.println(item);
		}
		return arr;
	}

	public static int ArrayCrossSum(int[] arr){
		var number = 0;
		for (int item: arr){
			number += item;
		}
		System.out.println(number);
		return number;
	}

}