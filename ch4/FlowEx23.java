package ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;

        // i--가 후위형이므로, 조건식이 평가된 후에
        // i의 값이 감소된다.
        // while (i-- != 0) {
        // System.out.println(i + "- I can do It");
        // }
        while (i != 0) {
            i--;
            System.out.println(i);
        }
    }

}
