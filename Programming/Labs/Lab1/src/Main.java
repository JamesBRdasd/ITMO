public class Main {
    public static void main(String[] args) {
        long[] s = new long[11];
        for (int i = 25, j = 0; i >= 5; i--) {
            if (i % 2 != 0) {
                s[j++] = i;
            }
        }

        float[] x = new float[11];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (-14 + Math.random() * 27);
        }
        double[][] w = new double[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                double res = 0;
                if (s[i] == 9) {
                    res = Math.pow((3 + Math.atan((x[j] - 0.5) / 27.0)) / 2.0, 2);
                }
                else if (s[i] == 7 || s[i] == 13 || s[i] == 21 || s[i] == 23 || s[i] == 25) {
                    res = Math.pow(1.0 / (2 * (1 - Math.cbrt(Math.cos(x[j])))), 2);
                }
                else {
                    res = Math.log(Math.pow(Math.sin(Math.cbrt(Math.pow(4 * Math.pow((1 - x[j]) / (3.0 / 4.0), 3), 2))), 2));
                }
                w[i][j] = res;
            }
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%10.4f ", w[i][j]);
            }
            System.out.println();
        }
    }
}
