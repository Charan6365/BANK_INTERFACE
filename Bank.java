package BANK_INTERFACE;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    String accoutHolderName;
    int accountNumber;
     double balance;
    int i=0,j;
    List<String> holdername=new ArrayList<>();
    List<Integer> accnum=new ArrayList<>();
    List<Double> bal=new ArrayList<>();
    
    
    public Bank(){
        holdername.add("Raghu");
    holdername.add("Balu");
    holdername.add("Kishore");
    accnum.add(++i);
    accnum.add(++i);
    accnum.add(++i);
    bal.add(500.0);
    bal.add(1500.0);
    bal.add(3000.0);
    }
   
    public boolean FindAcc(int num){
   for(int k=0;k<accnum.size();k++){
     if(accnum.get(k)==num){
        j=k;
        return true;
     }
   }
   return false;
    }

   
    public void deposit(double amount){
        bal.add(j,bal.get(j)+amount);
 System.out.println("Successfully deposited amount "+amount+"\nCurrent balance is: "+bal.get(j));
    }




    public void withdraw(double amount){
        bal.add(j,bal.get(j)-amount);
     System.out.println("Successfully withdrawn "+amount+"\nCurrent balance is: "+bal.get(j));
    }




    public void displayCurrentBalance(){
     System.out.println("Current balance is: "+bal.get(j));    

    }



    public boolean inSufficientBalance(double balance){
        if(bal.get(j)-balance<0){
        System.out.println("Current balance is lower than the withdraw amount.\n Current Balance is: "+bal.get(j));
    return true;}
    else{
   return false;}
    }




    public void createacc(String accoutHolderName,Double z) {
        holdername.add(accoutHolderName);
        accnum.add(++i);
        j=--i;
        bal.add(z);
        System.out.println("Your account number is : "+ ++i +"\nYour balance is: "+z);
    }

    public void displaydefault() {
        for(int k=0;k<bal.size();k++){
        System.out.println("AccountHolderName:"+holdername.get(k)+"    AccountNumber:"+accnum.get(k)+"    Balance:"+bal.get(k));
        }
    }
}
