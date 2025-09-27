public class Main {
    public static void main(String[] args) {
        long[] s = new long[11];
        for (int i = 25, j = 0; i >= 5; i--) {
            if (i % 2 != 0) {
                s[j++] = i;
            }
        }

        float[] x = new float[11];
        for (int i = 0; i < 11; i++) {
            x[i] = (float) (-14 + Math.random() * 27);
        }
        double[][] w = new double[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                w[i][j] = el(s[i],x[i]);
            }
        }
        mat(w);
    }
    public static double el(long sel, float fel) {
            double res = 0;
            if (sel == 9) {
                res = Math.pow((3 + Math.atan((fel - 0.5) / 27.0)) / 2.0, 2);
            }
            else if (sel == 7 || sel == 13 || sel == 21 || sel == 23 || sel == 25) {
                res = Math.pow(1.0 / (2 * (1 - Math.cbrt(Math.cos(fel)))), 2);
            }
            else {
                res = Math.log(Math.pow(Math.sin(Math.cbrt(Math.pow(4 * Math.pow((1 - fel) / (3.0 / 4.0), 3), 2))), 2));
            }

        return res;
    }
    public static void mat(double[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                System.out.printf("%10.4f ", matr[i][j]);
            }
            System.out.println();
        }
    }
}
