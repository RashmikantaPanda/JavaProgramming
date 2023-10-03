//ATM operations i.e. CheckBalacne,Deposit,Withdraw
package com.java.basics.introduction;

import java.util.Scanner;

public class ATMExample {
    int deposit;
    int withdraw;
    int balance=10000;
    void CheckBalance(){
        System.out.println("  ____________________________________________");
        System.out.println("| Available Balance - "+balance);
        System.out.println("|-------------------  ------------------------");
        System.out.println("| In words          - "+NumberToWordConversion.convertToWords(balance));
        System.out.println("  ---------------------------------------------");
    }
    void Deposit(int deposit){
        balance+=deposit;
        System.out.println(deposit+" rupees deposited Successfully.");

    }
    void Withdraw(int withdraw){
        if(balance>=withdraw){
            balance-=withdraw;
            System.out.println("Collect Your Money");
        }
        else{
            System.out.println("Insufficient Balance !!!");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ATMExample atm=new ATMExample();
        while (true){
            System.out.println("------ATM-------");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter your choice : ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    atm.CheckBalance();
                    break;
                case 2:
                    System.out.println("Enter deposit amount : ");
                    atm.deposit=sc.nextInt();
                    atm.Deposit(atm.deposit);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount : ");
                    atm.withdraw=sc.nextInt();
                    atm.Withdraw(atm.withdraw);
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Wrong Choice");



            }

        }
    }
}
