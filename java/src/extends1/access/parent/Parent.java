package extends1.access.parent;

public class Parent {

    public int publicvalue;//어디서든 접근 가능
    protected int protectedvalue;//같은 패키지안에서만 호출가능. 단 상속 관계이면 패키지 달라도 가능
    int defaultvalue;//같은 패키지 안에서만 가능
    private int privatevalue;//외부 안됨

    public void publicmethod() {
        System.out.println("parent.publicmethod");
    }
    protected void protectedmethod() {
        System.out.println("parent.protectedmethod");
    }
    void defaultmethod() {
        System.out.println("parent.defaultmethod");
    }
    private void privatemethod() {
        System.out.println("parent.privatemethod");
    }
    public void printparent() {
        System.out.println("==parent 메서드 안==");
        System.out.println("publicvalue = " + publicvalue);
        System.out.println("protectedvalue = " + protectedvalue);
        System.out.println("defaultvalue = " + defaultvalue);
        System.out.println("privatevalue = " + privatevalue);

        //부모 메서드 안에서 모두 접근 가능
        defaultmethod();
        privatemethod();
    }
}
