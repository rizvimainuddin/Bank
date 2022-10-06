public class ICICI extends Bank {
    static String bankName = "ICICI";
    double rateofinterest = 9;
    double amount;
    public static String getBankName() {
        return bankName;

    }


    ICICI(String accountNumber , String name, String ifsc,String branch,Main.typeOfAccount type,double balance) {
        super(accountNumber,name,ifsc,branch, type,balance);
        rateofinterest = 8.2;

    }
    public double getRateofinterest(){
        return rateofinterest;
    }
}
