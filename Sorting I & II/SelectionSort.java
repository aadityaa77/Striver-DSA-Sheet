class SelectionSort {

    public static int[] selectionSorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Step 1: assume current index is minimum
            int minIndex = i;

            // Step 2: find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Step 3: swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={64,25,12,22,11};
        int[] sortedArr = selectionSorting(arr);

    for (int num : sortedArr) {
        System.out.print(num + " ");
    }
    }
}