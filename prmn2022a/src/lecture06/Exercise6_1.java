package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("小数値を入力してください：");
        try{
            double a = input.nextDouble();
            System.out.println("入力した値:　" + a);
        }
        catch(InputMismatchException e){
            System.out.println("エラー.");
        }

    }
}
