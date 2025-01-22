package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 = 생성자 초기화
        System.out.println("생성자로 초기화");
        Constructint constructint1 = new Constructint(10);
        Constructint constructint2 = new Constructint(20);
        System.out.println(constructint1.value);
        System.out.println(constructint2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드로 초기화");
        Fieldinit fieldinit1 = new Fieldinit();
        Fieldinit fieldinit2 = new Fieldinit();
        Fieldinit fieldinit3 = new Fieldinit();
        System.out.println(fieldinit1.value);
        System.out.println(fieldinit2.value);
        System.out.println(fieldinit3.value);

        //상수
        System.out.println("상수");
        System.out.println(Fieldinit.constvalue);

    }
}
