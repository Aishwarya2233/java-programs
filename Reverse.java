import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        System.out.println("Enter a number : ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int rem ;
        while(num != 0){
            rem = num % 10;
            rev = (rev*10) + rem;
            num = num / 10;

        }
        System.out.println(rev);
    }
}
