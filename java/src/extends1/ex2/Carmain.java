package extends1.ex2;

public class Carmain {
    public static void main(String[] args) {
        Eleccar eleccar = new Eleccar();
        eleccar.move();//elecar에는 move가 없지만 car에 move가 있다. 상속을 받았기 때문ㄴ
        eleccar.charge();

        Gascar gascar = new Gascar();
        gascar.move();
        gascar.fillup();
    }
}
