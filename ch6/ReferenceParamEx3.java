public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum" + sumArr(arr));

    }

    // 배열의 모든 요소를 출력
    static void printArr(int[] arr) {
        System.out.println("[");
        for (int i : arr) {
            System.out.println(i + ",");
        }
        System.out.println("]");
    }

    // 배열의 모든 요소의 합을 반환
    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 배열을 오름차순으로 정렬
    static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
        }
    }
}
