import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {
    public static void main(String[] args) {
    
       // PuzzleJava.printSum(new int[] {1, 5, 10, 7, -2, 20, 30, 60});
       // PuzzleJava.printNames(new String[] {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"});
        PuzzleJava.alphabets(new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'});
}
// public static void printSum(int[] arr){
// 	    ArrayList<Integer> myArray = new ArrayList<Integer>();
	     	
// 	         int sum = 0;
//          for(int i = 0; i < arr.length; i++) {
         		
//          	if (arr[i] > 10){
//          		myArray.add(arr[i]);
//          	}
//          	sum += arr[i];
//          }
//          System.out.println(sum);
//           System.out.println(myArray);
// 	      } 	    

// public static void printNames(String[] arr) {
//         ArrayList<String> myArray = new ArrayList<String>();
//         // for (int i = 0; i < arr.length; i++) {
//         //     if (arr[i].length() > 10) {
//         //         myArray.add(arr[i]);
//         //     }
//         // }
//         for (int i = 0; i < arr.length; i++) {
//             Random rand = new Random(); 
//             int randomNum = rand.nextInt(arr.length); 
//             String temp = arr[i];
//             arr[i] = arr[randomNum];
//             arr[randomNum] = temp;
//         }
//         for (int n = 0; n < arr.length; n++) {
//             System.out.print(arr[n] + " ");
//             	if (arr[n].length() > 5) {
//                  myArray.add(arr[n]);
//              }
//         }
//         System.out.println(myArray);
//     }

    public static void alphabets(char[] arr) {
        ArrayList<String> myArray = new ArrayList<String>();
        
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random(); 
            int randomalpha = rand.nextInt(arr.length); 
            char temp = arr[i];
            arr[i] = arr[randomalpha];
            arr[randomalpha] = temp;
        }
        System.out.print("The shuffle list is: ");
         System.out.print(arr);
        for (int n = 0; n < arr.length; n++) {
           
            
            if (n == 0){
                if (arr[n] == 'a' || arr[n] == 'e'|| arr[n] == 'i' || arr[n] == 'o' || arr[n] == 'u'){
                    System.out.print("\nThe first letter is a vowel: "+ "It is: " + arr[n]);
                }
                else{


                System.out.print("\nThe first letter is: " + arr[n]);
                 }

            }

            if (n == arr.length-1){
                System.out.print("\nThe last letter is: " + arr[n] + "\n");
            }
            // System.out.print(arr[n] + " ");
            //     if (arr[n].length() > 5) {
            //      myArray.add(arr[n]);
            //  }
        
    }
}

}
