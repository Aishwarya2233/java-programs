import java.util.Scanner;
public class PerimeterOfRhombus {
    public static void main(String[] args){
        System.out.println("Enter the length of side of rhombus : ");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        double perimeter = (4*side) ;
        System.out.println("The area of rhombus is : "+ perimeter);

    }
}
