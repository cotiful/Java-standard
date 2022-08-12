
public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main이 시작됨");
        firstMethod();
        System.out.println("main이 끝났음");
    }

    static void firstMethod() {
        System.out.println("firstMethod가 시작됨");
        secondMethod();
        System.out.println("first가 끝났음");
    }

    static void secondMethod() {
        System.out.println("secondMethod가 시작됨");
        System.out.println("secondMethod가 끝났음");
    }
}
