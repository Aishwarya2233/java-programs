import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args){
        System.out.println("Enter the radius and height of the cone : ");
        // the formula for finding the volume of cone is Pi/3 * r square * h
        // Here we enter pi/3 value as 1.047 and calculate the volume
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = (1.047 * radius * radius * height);
        System.out.println("The volume of cone is : "+volume);
    }
}
