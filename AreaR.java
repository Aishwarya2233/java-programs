import java.util.Scanner;
public class AreaR {
    public static void main(String[] args){
        System.out.println("Enter length and breadth as integers : ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = (length * breadth);
        System.out.println(area);
    }
}

