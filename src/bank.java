public class bank {
    private int balance;
    private String accNo;

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void printBalance(){
        System.out.println(balance);
    }
}
