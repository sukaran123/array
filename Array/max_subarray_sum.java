public class max_subarray_sum {
    public static void maxSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i + 1; j < arr.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum of the subarray is: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        maxSubarraySum(arr);
    }
}
