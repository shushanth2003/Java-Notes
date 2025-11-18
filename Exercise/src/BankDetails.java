class BankAccount{

    String BankAcctNo;


    int balance;
    String AcctType;
    int withdraw;
    int deposit;
    public BankAccount(String bankAcctNo, int balance, String acctType, int withdraw, int deposit) {
        BankAcctNo = bankAcctNo;
        this.balance = balance;
        AcctType = acctType;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }

    public int getWithdraw() {
        if(withdraw<500){
            return 0;
        }else{
            return withdraw;
        }
    }

    public void setWithdraw(int withdraw) {
        if(withdraw<500) {
            System.out.println("Minimum Amount Should be above 500");
        }else{
            this.withdraw=withdraw;
            balance-=withdraw;
        }
    }

    public int getDeposit() {
        if(deposit<1000){
            return 0;
        }else{
            return deposit;
        }
    }

    public void setDeposit(int deposit) {
        if(deposit<1000){
            System.out.println("Deposit Amount Should be greater than 1000");
        }else{
            this.deposit = deposit;
            balance+=deposit;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "BankAcctNo='" + BankAcctNo + '\'' +
                ", balance=" + balance +
                ", AcctType='" + AcctType + '\'' +
                ", withdraw=" + withdraw +
                ", deposit=" + deposit +
                '}';
    }

}
public class BankDetails {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("INACC09832",20000,"Savings",0,0);
        bankAccount.setDeposit(10000);
        bankAccount.setWithdraw(5000);
        System.out.println(bankAccount.toString());
    }
}
