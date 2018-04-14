
import java.util.ArrayList;
public class Basic {
    public static void main(String[] args) {
        // Basic.Print1to255();
        // Basic.printOdd();
        // Basic.printSum();
        // Basic.iterateArray(new int[] {1,3,5,7,9,13});
        // Basic.arrayMax(new int[] {-3, -5, -7});//, 20});
        // Basic.ArrAverage(new int[] {2, 10, 3});
        // Basic.ArrayWithOddNumbers();
        // Basic.arrayGreaterThanY(new int[] {1,6,5,7,9,13}, 5);
        // Basic.squareTheValues(new int[] {1, 5, 10, -2});
        // Basic.eliminateNegatives(new int[] {1, 5, 10, -2});
        // Basic.maxMinAvg(new int[] {1,3,5,7,9,11,20});
    	 Basic.shiftingValuesInArray(new int[] {1, 5, 10, 7, -2});



    }



//     public static void Print1to255() {
//         for (int i =0; i<256; i++){
//         	System.out.println(i);
//         }
//     }
//     public static void printOdd() {
//         for(int i = 1; i < 256; i += 2) {
//             System.out.println(i);
//         }
// }
// 	public static void printSum() {
// 		int sum = 0;
//         for(int i = 1; i < 256; i++) {
//         	sum += i;
//             System.out.println("New Number: " + i + " sum: " + sum);
//         }
// }


// public static void iterateArray(int[] theArray) {
// 		// int [] theArray = {1,3,5,7,9,13};
//         for(int i = 0; i < theArray.length; i++) {
        	
//             System.out.println(theArray[i]);
//         }
// }

// 	public static void arrayMax(int[] arr) {
// 		// int [] theArray = {1,3,5,7,9,13};
// 			int max = arr[0];
//         for(int i = 0; i < arr.length; i++) {
//         	if (arr[i] > max){
//         		max = arr[i];
//         	}
//         }

//         System.out.println(max);
// }

	// public static void ArrAverage(int[] arr){
	//         int total = 0;
	//         for (int i = 0; i < arr.length; i++){
	//             total += arr[i];
	//         }
	//         int avg = total / arr.length;
	//         System.out.println(avg);
	//     } 




	// public static void ArrayWithOddNumbers(){
	// 	ArrayList<Integer> arrY = new ArrayList<Integer>();

	//         for(int i = 1; i < 256; i += 2) {
	//         	arrY.add(i);
	//         	// int num = arrY.get(0);
 //            	}
 //        	System.out.println(arrY);
	//     } 

	    // public static void arrayGreaterThanY(int[] arr, int y){
	    // 	int count = 0;
	    //     for(int i = 0; i < arr.length; i++) {
	        	
	    //     	if (arr[i] > y){
	    //     		count++;
	    //     	}
	        	
     //        	}
     //    	System.out.println(count);
	    // } 

	  // public static void squareTheValues(int[] arr){
   //  		ArrayList<Integer> myArray = new ArrayList<Integer>();
		 //         for(int i = 0; i < arr.length; i++) {
		 //        		arr[i] *= arr[i];
		 //        		myArray.add(arr[i]);
	  //            	}
	  //            	System.out.println(myArray);
		 //     } 


		// public static void eliminateNegatives(int[] arr){
	 //    	ArrayList<Integer> myArray = new ArrayList<Integer>();
	 //        for(int i = 0; i < arr.length; i++) {
	        	
	 //         	if (arr[i] < 0) {
	 //         		arr[i] = 0;
  //               	}
  //           	myArray.add(arr[i]);
	        
  //            	}
  //        	System.out.println(myArray);
	 //     } 	    

    // public static void maxMinAvg(int[] arr) {
    // ArrayList<Integer> myArray = new ArrayList<Integer>();
    //     int min = arr[0];
    //     int max = arr[0];
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum += arr[i];
    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }
    //         if (arr[i] < min) {
    //             min = arr[i];
    //         }
    //     }
    //     int avg = sum / arr.length;
    //     myArray.add(max);
    //      myArray.add(min);
    //       myArray.add(avg);
    //     System.out.println(myArray);
    //     // System.out.println(min);
    //     // System.out.println(avg);
    // }

   public static void shiftingValuesInArray(int[] arr){
	     	ArrayList<Integer> myArray = new ArrayList<Integer>();
	         for(int i = 1; i < arr.length; i++) {
	        	
	          if(i == arr.length - 1){
	          	 arr[i] = 0;
	          }
            	myArray.add(arr[i]);
	        
              	}
          	System.out.println(myArray);
	      } 	    


}






















