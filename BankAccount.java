package BANK_INTERFACE;

import java.util.Scanner;

public class BankAccount{
    

    public static void main(String[] args){
         Bank b=new Bank();
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Hello and Welcome to Bank!");
            System.out.println("***************************************************************************");
            System.out.println("By default there are some accounts created you can use them if you don't want to create a new account");
            b.displaydefault();
            System.out.println("***************************************************************************");
        while(i!=0){            
            System.out.print("Enter your account number(Want to create an new account? enter->'0'): ");
            int num=sc.nextInt();
            System.out.println();
            if(num==0){
            System.out.print("Enter your name: ");               
             String accoutHolderName=sc.next();
           b.createacc(accoutHolderName,0.0);
           i=0;
            }
           else if(b.FindAcc(num)){
                i=0;
            }
            else{
                System.out.println("Account doesn't exist!!!.Please enter a valid account number");
            }
        }

               
        while(i==0){
        System.out.println("***************************************************************************");

         System.out.println("Choose 1 to Withdraw");
         System.out.println("Choose 2 to Deposit");
         System.out.println("Choose 3 to Check your Balance amount");
         System.out.println("Choose 4 to EXIT");
         System.out.println("Choose an option to perform the respective operation");
         System.out.println("***************************************************************************");
         System.out.print("Enter your option: ");
         int num=sc.nextInt();
         switch(num){
           case 1:
           System.out.println("***************************************************************************");
           System.out.print("Enter the amount you want to withdraw from your account: ");
           double rem=sc.nextDouble();
           if(b.inSufficientBalance(rem)){
            System.out.println("***************************************************************************");
           break;
           }
           else{
            b.withdraw(rem);
           }
           System.out.println("***************************************************************************");
           break;
           case 2:
           System.out.println("***************************************************************************");
           System.out.print("Enter the amount you want to deposit: ");
           double add=sc.nextDouble();
           b.deposit(add);
           System.out.println("***************************************************************************");
           break;
           case 3:
           System.out.println("***************************************************************************");
           b.displayCurrentBalance();
           System.out.println("***************************************************************************");
           break;
           case 4:
           System.out.println("***************************************************************************");
           System.out.println("Exited");
           System.out.println("***************************************************************************");
           i=1;
           break;
           case 5:
           b.displaydefault();
           break;
           default:
           System.out.println("***************************************************************************");
           System.out.println("Enter valid option");
           System.out.println("***************************************************************************");
           break;
         }
         }
         sc.close();
    }
}