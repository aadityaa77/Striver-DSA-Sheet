// Example 1:
// Input:
//  arr[] = {2, 5, 1, 3, 0}  
// Output:
//  5  
// Explanation:
  
// 5 is the largest element in the array.

// Example 2:
// Input:
//  arr[] = {8, 10, 5, 7, 9}  
// Output:
//  10  
// Explanation:
  
// 10 is the largest element in the array.

public class LargestElement {
    public static int LargestElement(int[] arr){
        int max=0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={25,12,22,11};
        int largestElement = LargestElement(arr);

        System.out.println(largestElement);
    }
}
