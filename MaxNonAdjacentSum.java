class MaxNonAdjacentSum {

    public static int maxSum(int arr[]) {

        int prev = arr[0];
        int prev2 = 0;

        for(int i = 1; i < arr.length; i++) {

            int take = arr[i] + prev2;
            int notTake = prev;

            int curr = Math.max(take, notTake);

            prev2 = prev;
            prev = curr;
        }

        return prev;
    }

    public static void main(String[] args) {

        int arr[] = {2,1,4,9};

        System.out.println("Maximum sum is: " + maxSum(arr));
    }
}