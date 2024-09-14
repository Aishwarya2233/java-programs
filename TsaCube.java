import java.util.Scanner;
public class TsaCube {
    public static void main(String[] args){
        System.out.println("Enter the length of side of a cube : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double tsa = (6*a*a);
        System.out.println("The total surface area of the cube is : "+tsa);
    }
}
