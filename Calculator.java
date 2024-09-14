import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers and an operator: ");
        System.out.println("enter x as + or - or * or /");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double res = 0;
        char x = sc.next().charAt(0);
        if( x == '+' || x == '-' || x == '*' || x== '/'){
            if(x=='+'){
                res = (num1 + num2);
                System.out.println(res);
            } else if(x == '-'){
                res = (num1 - num2);
                System.out.println(res);
            } else if(x == '*'){
                res = (num1 * num2);
                System.out.println(res);
            } else if(x == '/'){
                res = ( num1/num2);
                System.out.println(res);
            } else{

                System.out.println("Inavlid");
            }

        }

    }

}
