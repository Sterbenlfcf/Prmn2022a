package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {

        ATM atm = new ATM();

        String name = "藤井智子";
        String number = "12345";
        long balance;

        if(atm.existsAccount(name, number)){
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
        }else{
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
            atm.registerAccount(name, number);
        }

        if(atm.existsAccount(name, number)){
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
        }else{
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
            atm.registerAccount(name, number);
        }

        atm.deposit(number, 1000);
        balance = atm.withdraw(number, 2000);
        System.out.println("残高:" + balance + " 円です。");
        balance = atm.withdraw(number, 500);
        System.out.println("残高:" + balance + " 円です。");

    }
}
