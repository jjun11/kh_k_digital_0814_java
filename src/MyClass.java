class MyClass {




    public static double calculate(double a, double b, double c, double d) {
        return (a + b) * c / d;
    }
    public static double five(double a, double b, double c, double d) {
            return a + b + c / d;
    }

    static double abab(double a, double b, double c, double d){
        return a * b * c * d;
    }

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 3;
        double d = 4;

        double result = calculate(a, b, c, d);
        double result2 = five(a, b, c, d);
        double result3 = abab(a, b, c, d);
        System.out.println(result); // 15.0
        System.out.printf("%.2f\n", result2); // 15.0
        System.out.println(result3);
        System.out.println(2.54*27);

    }
}