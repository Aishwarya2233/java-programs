import java.util.Scanner;
class Usd{
    public static void main(String[] args){
        System.out.println("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double usd = (num*0.02);
        System.out.println(usd);
    }
}
h