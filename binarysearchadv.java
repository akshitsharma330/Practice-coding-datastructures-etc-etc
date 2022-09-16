public class binarysearchadv {
    public static void main(String[] args) {
        int arr[] = { 104, 105, 107, 1, 3, 5, 7, 9, 11, 22, 34, 45, 56, 78, 90, 101 };
        int low = 0;
        int high = arr.length - 1;
        int key = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("element found");
            }
            if (arr[low] < arr[high]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[high]) {
                    low=mid+1;

                }else{
                    high = mid - 1;
                }
            }
        }

    }

}
