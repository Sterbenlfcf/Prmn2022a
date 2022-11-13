package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();

        System.out.println("何行分入力しますか？");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0;i < n;i++){
            System.out.println(i + 1  + "行目：");
            alist.add(scanner.nextLine());
        }

        System.out.println("入力した文字列：");
        for(String string : alist){
            System.out.println("[" + alist.indexOf(string) + "]" + string);
        }

    }
}
