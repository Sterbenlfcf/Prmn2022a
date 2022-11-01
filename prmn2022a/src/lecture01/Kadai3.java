package lecture01;

import java.util.Scanner;

public class Kadai3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("age = ");
        int age = input.nextInt();

        if(age < 20){   // ageが20未満の時
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        }else{          // ageが20以上の時
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }

    }
}
