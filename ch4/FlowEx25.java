package ch4;

import java.util.Scanner;

public class FlowEx25 {

    public static void main(String[] args) {
        // 각 자리의 합을 구하는 예제
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num = num / 10; // num /= 10
        }
        System.out.println("각 자리수의 합:" + sum);
    }

}
