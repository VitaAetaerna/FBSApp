class Main {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4, 5, 6, 7, 8, 9};
		reverseArray2(arr);
		for (int item: arr){
			System.out.println(item);
		}
	}
		public static int[] reverseArray(int[] arr){
			for (int i=0; i<arr.length / 2; i++){
				var tmp = arr[i];
				arr[i] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = tmp;
			}
			return arr;
	}

		public static int[] reverseArray2(int[] arr){
			for (int i=0, j=arr.length - 1; i<arr.length / 2; i++, j--){
				var tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			return arr;
	}
}
