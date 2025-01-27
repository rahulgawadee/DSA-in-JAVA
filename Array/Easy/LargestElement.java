package Array.Easy;

public class LargestElement {

    public static int findLargest(int arr[]){

        int max = arr[0];       // here well get the pointer to the first index of array

        for(int i =0; i<arr.length; i++){       //we'll run the loop from the 0 to full length
            if(arr[i] > max){                  // agar we found ki uss index se bhi jyada bada hai value then it will compare 
                max = arr[i];                   //It will update it accordingly..

            }
        }
        return max;                             // It will get updated as a return value
    }
    public static void main(String args[]) {
        
        int arr[] = {2,6,7,1,9,4};              // Lets take a array example 
        System.out.println(findLargest(arr));   //Lets Print the function in the Terminal
    }
}
