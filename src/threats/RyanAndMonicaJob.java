package threats;

/**
 * Created by yevgeniya.zuyeva on 22.12.2016.
 */
public class RyanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args){
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();

    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            makeWithdrawl(10);
            if(account.getBalance()<0){
                System.out.println("Out of Limit! Your balance="+account.getBalance());
            }
        }

    }

    private  /*synchronized*/ void makeWithdrawl(int amount){
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" is preparing to get money");


            try {
                System.out.println(Thread.currentThread().getName()+" goes to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" is done. Balance="+account.getBalance());

        }
        else {
            System.out.println("Sorry, for "+Thread.currentThread().getName()+" is not enough money");
        }
    }
}

class BankAccount{
    private int balance = 100;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        balance = balance-amount;
    }

}
