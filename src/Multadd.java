import java.lang.Math;

public class Multadd {

    public static void main(String[] args) { //2
        // Test parameters
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
//Return Is at the buttom
        double sum = Multadd(a, b, c); //3
        System.out.println("Sum: " + sum);

        // First Trig Equation
        double sin = Math.sin(Math.PI / 4);
        double cos = Math.cos(Math.PI / 4);
        double One = sin + (cos / 2);

        System.out.println("Trig Equation Two: " + One);

        // Second Trig Equation
        double log1 = Math.log10(10.0);
        double log2 = Math.log10(20.0);
        double Two = log1 + log2;

        System.out.println("Trig Equation Two: " + Two);
    }

    // Method a * b + c
    public static double Multadd(double a, double b, double c) {
        return a * b + c; //2
    }

    //xe^{-x}+\sqrt{1-e^{-x}}
    public static double expSum(double x) {//5.1

        //Take a double as a parameter, use multadd //5.2
        double power = x * Math.exp(-x);

        double sqrtEx = Math.sqrt(1 - Math.exp(-x));

        return power + sqrtEx;
    }

}
