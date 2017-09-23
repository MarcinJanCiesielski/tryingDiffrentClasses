package math;

public class MathTry {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.pow(4,4));

        System.out.println(Math.sqrt(4));

        double negt = -10;
        System.out.println(Math.abs(negt));

        double cos = Math.cos(Math.PI/2);
        System.out.println(cos + "; to radian: " + Math.toRadians(cos));

        double rounded = Math.round(3.33333333);
        System.out.println(rounded);

    }
}
