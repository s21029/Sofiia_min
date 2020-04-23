import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;

    public class Multiplier {

        int a;
        int b;
        int x;
        int y;
        double aa;
        double bb;


        public Multiplier(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int multiply(int x, int y) {
            return x * y;
        }


        public int  multiply(int a, int b, int x, int y) {

            return a * b * x * y;
        }

        public double multiply(double aa, double bb) {

            return aa * bb;
        }

        public int multiply(List<Integer> a) {
            int s = 1;
            for (int i = 0; i < a.size(); i++) {
                s = s * a.get(i);
            }
            return s;
        }

        public BigDecimal mutiply(BigDecimal a, BigDecimal b) {
            return a.multiply(b);
        }
    }