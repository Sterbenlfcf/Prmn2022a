package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private List<Account> accountList;

    public ATM(){
        this.accountList = new ArrayList<>();
    }

    public void registerAccount(String name, String number){
        accountList.add(new Account(name, number));
        System.out.println(name + " さんのアカウントを口座番号：" + number + " で登録しました。");
    }

    public boolean existsAccount(String name, String number){
        for(Account acc : this.accountList){
            if(name.equals(acc.getName()) && number.equals(acc.getNumber())){
                return true;
            }
        }
        return false;
    }

    public void deposit(String number, long money){
        for(Account acc : this.accountList){
            if(number.equals(acc.getNumber())){
                acc.setBalance(acc.getBalance() + money);
                System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");
            }
        }
    }

    public long withdraw(String number, long money){
        for(Account acc : this.accountList){
            if(number.equals(acc.getNumber())){
                if(acc.getBalance() < money){
                    System.out.print("口座番号:" + number + " から " + money + " 円引き出せませんでした。");
                }else{
                    acc.setBalance(acc.getBalance() - money);
                    System.out.print("口座番号:" + number + " から " + money + " 円引き出しました。");
                }
                return acc.getBalance();
            }
        }
        return 0;
    }

}
