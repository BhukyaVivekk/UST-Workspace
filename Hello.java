import java.util.Scanner;
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is max");
        }else{
            System.out.println("num2 is max");
        }
    }
}
