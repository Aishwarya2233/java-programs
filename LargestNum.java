import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        System.out.println("Enter any 2 integers: ");
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1);
        } else{
            System.out.println(num2);
        }
    }
}
