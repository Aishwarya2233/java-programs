import java.util.Scanner;

class AreaC {
    public static void main(String[] args){
        System.out.println("Enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double pi = 3.14;
        double area = (2*pi*num);
        System.out.println(area);
    }

}
