public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {12, 4, 17, 8, 25, 3, 19};
        int K = 25;

        int index = linearSearch(arr, K);
        System.out.println("Vị trí của " + K + " là: " + index);
    }


    static int linearSearch(int[] arr, int K) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                return i;
            }
        }
        return -1;
    }
}
