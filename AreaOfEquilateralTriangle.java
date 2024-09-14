import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main(String[] args){
        System.out.println("Enter the length of the side : ");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double area = (0.433 * side * side );
        System.out.println("The area of equilateral triangle is " + area);

    }

}
