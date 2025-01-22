package extends1.ex1;

public class Carmain {
    public static void main(String[] args) {
        Eletriccar car = new Eletriccar();
        car.move();
        car.move();

        Gascar gascar = new Gascar();
        gascar.move();
        gascar.fillup();
    }
}
