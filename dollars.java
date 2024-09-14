import java.util.Scanner;
public class dollars {
    public static void main(String[] args){
        System.out.println("Enter an integer: ");
        Scanner sc= new Scanner (System.in);
        int num = sc.nextInt();
        double dollar = (num*0.012);
        System.out.println(dollar);

    }
}
