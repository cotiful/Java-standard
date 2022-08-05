package ch4;

public class FlowEx31 {
    // 1과 10사이의 숫자를 출력하되 그 중에서 3의 배수인 것을 제외
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                continue;
            System.out.println(i);
        }
    }

}
