import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        double mass = console.nextDouble();
        double height = console.nextDouble();
        double bmi = mass / (height * height);
        System.out.println(bmi);
    }
}
