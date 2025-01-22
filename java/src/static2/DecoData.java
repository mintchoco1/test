package static2;

public class DecoData {
    private int instancevalue;
    private static int staticvalue;

    public static void staticall(){
        //instancevlaue++ 인스턴스 변수 접근불가능
        //instacnemethod() 인스턴스 메서드 접근 불가능

        staticvalue++;//정적 변수에 접근가능
        staticmethod();//정적 메소드 접근가능
        //이 메소드가 정적 메소드라서 정적 변수와 정적 메소드만 다룰수 있다
    }

    public void instancecall(){
        instancevalue++;
        instancevalue();

        staticvalue++;
        staticmethod();
    }

    private void instancevalue(){
        System.out.println("instancevalue= " + instancevalue);
    }

    private static void staticmethod(){
        System.out.println("staticvalue="+staticvalue);
    }
}
