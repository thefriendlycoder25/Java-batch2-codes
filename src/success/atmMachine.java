package success;
import baharwalaPackage.*;

import java.util.Scanner;
class salary{
    int pin = 1234;
    int balance = 20000;

}
class savings extends salary{
    int balance = 5000;
    Scanner sc = new Scanner(System.in);
    boolean checkPin(int pin){
        if(pin==super.pin){
            return true;
        }
        return false;
    }
    boolean withdraw(){
        System.out.println("1.Salary 2.Savings");
        int c = sc.nextInt();
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        if(c==1){
            if(super.balance>=amount){
                super.balance = super.balance-amount;
                return true;
            }
            return false;
        }
        if(c==2){
            if(this.balance>=amount){
                this.balance = this.balance-amount;
                return true;
            }
            return false;
        }
        return true;
    }
    void checkBalance(){
        System.out.println("Salary account Balance "+ super.balance);
        System.out.println("Savings account Balance "+ this.balance);
    }
    void deposit(){
        System.out.println("1. Salary 2. Savings");
        int c= sc.nextInt();
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        if(c==1){
                super.balance = super.balance+amount;
        }
        if(c==2){
                this.balance = this.balance+amount;
        }
    }
}
public class atmMachine {

    public static void main(String[] args) {
        savings s1 = new savings();
        Scanner sc = new Scanner(System.in);
        boolean b1 = false;
        System.out.println("Enter the pin");
        int pin = sc.nextInt();
        try {
            b1 = s1.checkPin(pin);//boolean b1 runs the machine if pin is correct
            while (b1) {
                System.out.println("1.Withdraw 2.Check Balance 3. Deposit 4.Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        b1 = s1.withdraw();
                        break;
                    case 2:
                        s1.checkBalance();
                        break;
                    case 3:
                        s1.deposit();
                        break;
                    case 4:
                        b1 = false;
                        break;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally { //executes always irrespective of the transaction is successfull or not
            System.out.println("Ejecting Card");
            pin = 0000; //reseting the pin variable to '0'
        }

    }
}
