package final1;

public class Finalrefmain {
    public static void main(String[] args) {
        final Data data = new Data();//참조형을 final 로 선언. 참조 대상을 바꿀 수 없다

        //객체가 가리키는 대상의 값은 바꿀수 있다
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
