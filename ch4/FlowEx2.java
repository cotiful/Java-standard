package ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.println("숫자하나입력해라");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if (input == 0) {
            System.out.println("0입력했네?");

        } else {
            System.out.println("입력한거 0 아닌데?");
            System.out.printf("입력한 숫자는 %d이네?", input);
        }

    }

}
