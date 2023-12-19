//task 303
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    Scanner scan=new Scanner(System.in);
    double a=scan.nextFloat();
    double b=scan.nextFloat();
    double c=scan.nextFloat();
    double D=(b*b)-4*a*c;

        if (D < 0) {
            System.out.println("no solution");
        }
        else if (D == 0) {
            double x= (-b) / (2 * a);

            System.out.println(x);
        }
        else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1+" "+x2);

        }
}
}