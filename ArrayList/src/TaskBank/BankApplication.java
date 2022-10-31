package TaskBank;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankApplication {
    protected String name;
    private ArrayList<Account> accounts=new ArrayList<>();

    public BankApplication(){
        this.name="";
    }
    public BankApplication(String name){
        this.name=name;
    }
    public void addAccount(Account a){
        accounts.add(a);
    }
    public void removeAccount(int i){
        accounts.remove(i);
    }
    public Account getMaxAccount(){
        double max=accounts.get(0).getBalance();
        int indexMax=0;
        for (int i=1;i<accounts.size();i++){
            if(accounts.get(i).getBalance()>max){
                max=accounts.get(i).getBalance();
                indexMax=i;
            }
        }
        return accounts.get(indexMax);
    }
    public double getAverageBalance(){
        double sum=0;
        for(int i=0; i<accounts.size();i++){
            sum=sum+accounts.get(i).getBalance();
        }
        return sum/accounts.size();
    }
    public double getTotalBalance(){
        double sum=0;
        for(int i=0; i<accounts.size();i++){
            sum=sum+accounts.get(i).getBalance();
        }
        return sum;
    }
    public int totalAccounts(){
        return accounts.size();
    }
    public  String getBankData(){
        return name+" "+totalAccounts()+" "+getTotalBalance()+" "+getAverageBalance();
    }

}
