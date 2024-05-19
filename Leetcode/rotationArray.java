//find pivot
//search in first half
// or search in the second

// mid> mid+1 // pivot
// mid < mid -1 // pivot
//start> mid 
//start < mid

public class rotationArray {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,8,9,10,0,1,2};
        System.out.println(findpivot(arr));
        System.out.println(countpivot(arr));
        
    }
    static int countpivot(int[] arr){
        int pivot = findpivot(arr);
        return pivot+1;
    }

    static int Search(int[] arr, int target){
        int pivot = findpivot(arr);
        if (pivot == -1){
            return binarySearch(arr,target, 0, arr.length-1);
        }
        if (arr[pivot]== target){
            return pivot;
        
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, target, pivot);
        }
        return binarySearch(arr, target, target, pivot);
    }
    static int binarySearch(int[]arr, int target, int start, int end){

        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }return start;
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(start<= end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid]< arr[mid+1]){
                return mid-1;
            }
            if(arr[mid]<= arr[start]){
                end = mid -1 ;

            }else{
                start = mid + 1;
            }
        }return -1;
    }
}
