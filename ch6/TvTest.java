
class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class TvTest {
    public static void main(String[] args) {
        Tv t; // 참조 변수 t를 선언
        t = new Tv();
        // color는 참조형이기 때문에 null, power 는 fales, channel 은 int 이므로 0 으로 초기화 된다.
        t.channel = 7;
        t.channelDown();
        ;
        System.out.println("현재 채널은 " + t.channel + "입니다.");

    }
}
