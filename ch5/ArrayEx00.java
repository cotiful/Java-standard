package ch5;

public class ArrayEx00 {

    public static void main(String[] args) {
        int[] score; // 선언(배열을 다루기 위한 참조변수 선언)
        score = new int[5]; // 생성(실제 저장공간을 생성)

        int[] score2 = new int[5]; // 배열의 주소가 저장

        score[3] = 100;
        int value = score[3];
    }

}
