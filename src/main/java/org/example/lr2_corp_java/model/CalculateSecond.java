package org.example.lr2_corp_java.model;

import java.util.ArrayList;
import java.util.List;

public class CalculateSecond {
    public static List<Double> calculateTabulate(double a, double b, double h) {
        List<Double> result = new ArrayList<>();
        for (double x=a;x<=b;x+=h){
            if (x>0){
            double y=Math.tan(Math.log(x));
            result.add(y);
        } else{
                result.add(Double.NaN);
            }
        }
        return result;
    }
}
