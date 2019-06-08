

public class arrays {
	public static void basic_array_example() {
		int arr[]=new int[4];
		arr[1] = 3;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void array1d_example() {
		int linearArray[] = {1,2,3,6};
		for(int i = 0; i<linearArray.length; i++) {
			System.out.print(linearArray[i] + " ");
		}
		System.out.println();
		
		for(int i : linearArray) {
			System.out.print(i + " ");
		}
		System.out.println("\n");		
	}
	
	public static void array2d_example() {
		int array2d[][] = {
				{1,2,3,4},
				{5,6,7},
				{8,9,10,11}
		};
		
		for(int i=0; i<array2d.length; i++) {
			for(int j=0; j<array2d[i].length;j++) {
				System.out.print(array2d[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i[] : array2d) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void ArrayDimensions_raw() {
		
		int array2d[][] = {{1,2,3},{1,2,3},{1,2,3}};
		
		int array3d[][][] = {
				{ {1,2,3}, {4,5,6}, {4,5,6}},
				{ {7,8},{9,10} },
				{ {7,8},{9,10} },
				{ {7,8},{9,10} },
		};
		
		int array4d[][][][] = {
				{ 
				  {{1,2,3}, {4,5,6}, {4,5,6}}, 
				  {{1,2,3}, {4,5,6}, {4,5,6}}, 
				},
				{ 
				  {{1,2,3}, {4,5,6}, {4,5,6}}, 
				  {{1,2,3}, {4,5,6}, {4,5,6}} 
				},
		};
		
	}
	
public static void ArrayDimensions() {
		int a[] = {1,2,3};
		int b[] = {4,5};
		int c[] = {7,8,9,10};
	
		int array2d[][] = {a,b,c};
		
		int array3d[][][] = { array2d, array2d };
		
		int array4d[][][][] = {array3d,array3d};

		
		int array5d[][][][][] = { array4d, array4d };
		
		
		for(int i[][]:array3d) {
			for(int j[]:i) {
				for(int k:j) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

//	public static<T> void printarr(T arr){
//		if(arr.length!=0){ 
//			for(var i: arr){
//				System.out.print(i);
//			}
//
//		}
//		else{
//			for(var i : arr){
//				printarr(i);
//			}
//		}
//	}
//	
//	public static void arrayExample(){
//		int a[]={1,2,3};
//		int b[]={4,5};
//		int c[]={6,7,8};
//
//		int arr2d[][]={ a, b, c};
//
//		int arr3d[][][]={arr2d,arr2d};
//		int arr4d[][][][]={arr3d, arr3d};
//
//		printarr(arr3d);
//
//	}

public static void main(String[] args) {
	//		basic_array_example();
	//		array1d_example();
	//		array2d_example();
	ArrayDimensions();


}

}
