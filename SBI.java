public class SBI extends Bank {
    static String bankName = "SBI";
    double rateofinterest = 7.9;
    double amount;
    public static String getBankName() {
        return bankName;

    }

    SBI(String accountNumber , String name, String ifsc,String branch,Main.typeOfAccount type,double balance) {
        super(accountNumber,name,ifsc,branch, type,balance);
        rateofinterest = 9.2;
    }
    public double getRateofinterest(){
        return rateofinterest;
    }
}
