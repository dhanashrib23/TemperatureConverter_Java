import java.util.*;

public class GitPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        double Fahrenheit = sc.nextDouble();
        FahrenheitToDegree(Fahrenheit);
    }

    public static void FahrenheitToDegree(double Fahrenheit) {
        double degree = (Fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in degree celcius is : " + degree);
    }

}
