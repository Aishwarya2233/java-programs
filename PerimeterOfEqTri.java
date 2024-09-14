import java.util.Scanner;
public class PerimeterOfEqTri {
    public static void  main(String[] args){
        System.out.println("Enter the side of equilateral triangle : ");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = (3*side) ;
        System.out.println(perimeter);
    }

}
