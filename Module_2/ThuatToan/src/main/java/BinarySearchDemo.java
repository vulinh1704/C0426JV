public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8, 9};
        int K = 8;

        int index = binarySearch(arr, K);
        System.out.println("Vị trí của " + K + " là: " + index);
    }

    static int binarySearch(int[] arr, int K) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == K) {
                return mid;
            } else if (K > arr[mid]) {
                left = mid + 1;
            } else if (K < arr[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
