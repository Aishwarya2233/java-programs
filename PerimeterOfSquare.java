import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args){
        System.out.println("Enter the side of square : ");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = (4*side);
        System.out.println("The perimeter of square is : "+ perimeter);

    }
}
