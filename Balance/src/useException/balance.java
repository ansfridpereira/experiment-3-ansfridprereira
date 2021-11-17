package useException;

class LessBalanceException extends Throwable {
    public LessBalanceException(int num)
    {
        System.out.println("Amount Rs "+num+" is not available in your account");
    }
}
class account{
    int balance=1000;
    void deposit(int amount){
        balance+=amount;
        System.out.println("Amount "+amount+" deposited.");
    }
    void withdraw(int amount){
        try {
            if (amount>balance)
                throw new LessBalanceException(amount);
            balance-=amount;
            System.out.println("Amount withdrawn is "+amount+" .\nCurrent balance is "+balance);
        }catch (LessBalanceException bal){}
    }
}
public class balance {
    public static void main(String[] args){
        account a1=new account();
        account a2=new account();
        System.out.println("The account balance is ");
        a1.deposit(1000);
        System.out.println("The account details are");
        a2.withdraw(2000);
    }
}
