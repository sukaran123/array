public class binary_search {
    public static int Binary_search(int arr[],int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return arr[mid];
            }
            else if(arr[mid] < key){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 10  ;
        System.out.println("The element was found at " + Binary_search(arr,key));
    }
}
