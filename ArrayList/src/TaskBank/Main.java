package TaskBank;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        BankApplication b1=new BankApplication("Gold");
        BankApplication b2=new BankApplication("Silver");
        BankApplication b3=new BankApplication("Bronze");
        int balanceGold=300000;
        for(int i=0;i<10;i++){
            Account wdcwcre= new Account(3,"Mr","Gold",balanceGold+i*10000);
            b1.addAccount(wdcwcre);
        }
        int balanceSilver=200000;
        for(int i=0;i<10;i++){
            Account a= new Account(2,"Mr","Silver",balanceSilver+i*10000);
            b2.addAccount(a);
        }
        int balanceBronze=100000;
        for(int i=0;i<10;i++){
            Account a= new Account(1,"Mr","Bronze",balanceBronze+i*10000);
            b3.addAccount(a);
        }
        ArrayList<BankApplication> bankList= new ArrayList<>();
        bankList.add(b1);
        bankList.add(b2);
        bankList.add(b3);

        if(bankList.get(0).getAverageBalance()<bankList.get(1).getAverageBalance()){
            BankApplication tempBank=bankList.get(0);
            bankList.set(0,bankList.get(1));
            bankList.set(1,tempBank);
        }
        if(bankList.get(2).getAverageBalance()>bankList.get(1).getAverageBalance() && bankList.get(2).getAverageBalance()<=bankList.get(0).getAverageBalance()) {
            BankApplication tempBank = bankList.get(2);
            bankList.set(2, bankList.get(1));
            bankList.set(1, tempBank);
        }
        else if(bankList.get(2).getAverageBalance()>bankList.get(0).getAverageBalance()){
            BankApplication tempBank = bankList.get(0);
            bankList.set(0,bankList.get(2));
            bankList.set(2,tempBank);
        }
        for(int i=0;i<3;i++){
            System.out.println(bankList.get(i).getBankData());
        }


    }
}
