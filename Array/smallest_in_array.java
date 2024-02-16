public class smallest_in_array {
    public static int Smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,6,5,8,7,9,8,1};
        System.out.println("The smallest element in this array is " + Smallest(arr));
    }
}
