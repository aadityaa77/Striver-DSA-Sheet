class SecondSmallest_Largest {

    public static int SecondLargestElement(int[] arr){
        int max=0;
        int second=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if(second<arr[j] && arr[j]<max){
                second=arr[j];
            }
        }
        return second;
    }

    public static int SecondSmallestElement(int[] arr){
        int min=Integer.MAX_VALUE;
        int second=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if(second>arr[j] && arr[j]>min){
                second=arr[j];
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr={25,12,22,11,65,5,2,13};
        int secondLargestElement = SecondLargestElement(arr);
        int secondSmallestElement= SecondSmallestElement(arr);

        System.out.println(secondLargestElement);
        System.out.println(secondSmallestElement);
    }
}
