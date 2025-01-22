package static2;

public class DeocDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticall();

        System.out.println("2.인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instancecall();

        System.out.println("인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instancecall();
    }
}
