public class BOI extends Bank {
    static String bankName = "BOI";
    double rateOfInterest = 6.9;
    double amount;
    public static String getBankName() {
        return bankName;

    }


    BOI(String accountNumber , String name, String ifsc,String branch,Main.typeOfAccount type,double balance) {
        super(accountNumber,name,ifsc,branch, type,balance);
        rateofinterest = 7.2;

    }
    public double getRateofinterest(){
        return rateofinterest;
    }
}
