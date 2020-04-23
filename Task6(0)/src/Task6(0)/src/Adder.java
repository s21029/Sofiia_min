
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {
    int a;
    int b;


   public Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void add(int v, int c, int z) {
    }

    public int add(int a, int b) {

        return a + b;
    }
    public static void add(ArrayList<BigDecimal> bigDecList) {
        System.out.println("Taking as argument a list of BigDecimal objects: ");
        for (BigDecimal value : bigDecList) {
            System.out.println(value);
        }

    }

}

