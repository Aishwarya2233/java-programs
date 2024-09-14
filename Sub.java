import java.util.Scanner;
public class Sub{
    public static void main(String[] args){
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp,product,actualNum,sum = 0 ;
        while(number>0){
            temp = n % 10;
            sum = sum + temp;
            product = product * temp;
            number = number/10;
        }
        actualNum = product - sum;
        System.out.println(actualNum);
    }
}
