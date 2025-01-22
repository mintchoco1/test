package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10;//최초 한번만 할당 가능
        //data1 = 20 하면 컴파일 오류남

        //final 지역 변수
        final int data2 = 20;

        method(10);
    }
    static void method(final int parameter) {
        //parameter = 30 해도 못 바꿈 final 은 들어오면 값을 바꾸지 못함
    }
}
