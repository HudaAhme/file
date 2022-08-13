import java.util.Scanner;

/**
 * Created by DELL on 13/08/2022.
 */
public class resalt3numbers {
    public static void main(String[] args) {
        int num1,num2,num3,resalt;
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        num1=input.nextInt();

        System.out.println("enter seconed number");
        num2=input.nextInt();

        System.out.println("enter thired number");
        num3=input.nextInt();

        resalt=num1*num2*num3;
        System.out.println(resalt);
    }
}
