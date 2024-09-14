import java.util.Scanner;
public class VolumeOfPyramid {
    public static void main(String[] args){
        System.out.println("Enter base and height of the pyramid");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = (0.33*base*height);
        System.out.println("The volume of the pyramid is " + volume);
    }
}
