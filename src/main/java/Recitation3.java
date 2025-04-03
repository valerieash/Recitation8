import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
//
        System.out.println("Enter x:");
        double x = scan.nextDouble();
        System.out.println("Enter y:");
        double y = scan.nextDouble();

        Circle circle16 = new Circle(new Point(x,y), 16.0);
        Circle circle40 = new Circle(new Point(14,12), 40.0);

        System.out.println(circle16.intersects(circle40));
    }
}
