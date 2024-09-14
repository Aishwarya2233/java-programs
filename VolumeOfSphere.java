import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args){
        System.out.println("Enter the radius of the sphere : ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double volume = (4.188 * radius * radius * radius);
        System.out.println("The volume of the sphere is : "+ volume);
    }
}

