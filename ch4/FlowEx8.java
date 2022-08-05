package ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("주번 적어라");

        Scanner scanner = new Scanner(System.in);
        String regNO = scanner.nextLine();

        // 입력받은 번호의 8번째 문자를 gender에 저장
        char gender = regNO.charAt(7);

        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자네요");
                break;
            case '2':
            case '4':
                System.out.println("여자네요");
                break;
            default:
                System.out.println("없는 주민등록번호네요");
        }
    }

}
