class Main{
	public static void main(String[] args){
		Edges();
	}
	public static int[][] Edges(){
		int value = 0;
		int[][] arr = new int[3][3];
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++){
				value = value + 1;
				arr[i][j] = value;
			}
		}

		for (int x=0; x<arr.length; x++){
			for (int y=0; y<arr[x].length; y++){
				System.out.print("   "+arr[x][y]+" ");
			}
			System.out.println("");
		}

			System.out.println("");
			System.out.println("");
		


		for (int x=0; x<arr.length; x++){
			if (x == 0 || x == arr.length - 1){
				for (int y=0; y<arr[x].length; y++){
					System.out.print("   "+arr[x][y]+" ");
			}
			}else{
			System.out.print("   "+arr[x][0]+" 	     "	+ arr[x][arr[x].length - 1]);	
			}

			System.out.println("");
		}

		return arr;


	}
}