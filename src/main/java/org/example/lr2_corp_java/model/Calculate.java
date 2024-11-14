package org.example.lr2_corp_java.model;

public class Calculate {
    private double x;

    public Calculate(double x) {
        this.x = x;
    }
    public double calculateSum(int n) {
        double sum = 1.0;
        double term = 1.0;
        for (int i = 1; i < n; i++) {
            term *= -1*x*x/((2*i)*(2*i+1));
            sum += term;
        }
        return sum;
    }

    public SumResult calculateSumThr(int n, double e) {
        double sum = 1.0;
        double term = 1.0;
        int count = 0;
        for (int i = 1; Math.abs(term) > e && i < n; i++) {
            term *= -1 * x * x / ((2 * i) * (2 * i + 1));
            sum += term;
            count++;
        }
        return new SumResult(sum, count);
    }

    public double exactVal() {
        return Math.sin(x)/x;
    }

}
