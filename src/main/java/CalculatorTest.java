import org.junit.Test;

public class CalculatorTest extends Calculator {
    @Test
    public void plusTest() {
        int a = plus(2,8);
        if (a == 10) { System.out.println("ok"); }
        else { System.out.println("error!");}
    }
    @Test
    public void minusTest() {
        int a = minus(7,5);
        if (a == 2) { System.out.println("ok"); }
        else { System.out.println("error!");}
    }
    @Test
    public void multiTest() {
        int a = multi(8,7);
        if (a == 56) { System.out.println("ok"); }
        else { System.out.println("error!");}
    }
    @Test
    public void divideTest() {
        int a = divide(8,4);
        if (a == 2) { System.out.println("ok"); }
        else { System.out.println("error!"); }
    }
    @Test
    public void sqPerimeterTest() {
        int a = sqPerimeter(6);
        if (a == 24) { System.out.println("ok"); }
        else { System.out.println("error!"); }
    }
}
