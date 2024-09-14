import java.util.Scanner;
public class VolumeOfPrism {
    public static void main(String[] args){
        System.out.println("Enter the base and height of prism : ");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = (base * height);
        System.out.println("The volume of prism is : "+ volume);
    }
}
