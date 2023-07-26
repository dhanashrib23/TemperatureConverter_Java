import java.util.*;

//Dhanashri 
public class GitPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        double Fahrenheit = sc.nextDouble();
        FahrenheitToDegree(Fahrenheit);
        FahrenheitToKelvin(Fahrenheit);
    }

    public static void FahrenheitToDegree(double Fahrenheit) {
        double degree = (Fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in degree celcius is : " + degree);
    }

    public static void FahrenheitToKelvin(double Fahrenheit) {
        double kelvin = (Fahrenheit - 32) * (5 / 9) + 273.15;
        System.out.println("The temperature in kelvin is : " + kelvin);
    }

}