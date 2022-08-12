public class ReferenceParamEx02 {

    public static void main(String[] args) {
        int[] x = { 10 }; // 크기가 1인 배열 , x[0] = 10;
        System.out.println(x[0]);

        change(x);
        System.out.println("After change");
        System.out.println("main() : x" + x[0]);
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("chage() : x" + x[0]);
    }
}