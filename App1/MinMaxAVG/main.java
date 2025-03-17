class Main{
	public static void main(String[] args){
		int[] arr = {10, 5, 4, 2, 12, 6};
	
		Min(arr);
		Max(arr);
		Avg(arr);
	} 

	public static int Min(int[] arr){
		if (arr == null) {return 0;}
		int num = arr[0];
	for (int i=0; i<arr.length; i++){
		for (int item: arr){
			if (item > num) num = item;
		}
	}
		System.out.println("MIN: "+num);
		return num;
	}

	public static int Max(int[] arr){
		if (arr == null) {return 0;}

		int num = arr[0];
		for (int i=0; i<arr.length; i++){
			for (int item: arr){
				if (item < num) num = item;
			}	
		}
		
		System.out.println("MAX:"+num);
		return num;
	}

	public static int Avg(int[] arr){
		if (arr == null) {return 0;}

		int sum = 0; 
		for (int item: arr) {
			sum = sum + item;
		}
		sum = sum / arr.length;
		System.out.println("AVG:"+sum);
		return sum;
	}

}