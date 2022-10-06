import javax.naming.InsufficientResourcesException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


public class Bank {
    protected String AccountNo;
    protected String Name;
    protected String IFSC;
    protected String branch;
    protected Main.typeOfAccount tp;
    double balance;

    public Bank(String accountNo, String name, String IFSC, String branch, Main.typeOfAccount tp, double balance) {
        this.AccountNo = accountNo;
        this.Name = name;
        this.IFSC = IFSC;
        this.branch = branch;
        this.tp = tp;
        this.balance = balance;
    }

    public void fileWrite(double balance,double amount) throws IOException{
        FileWriter fileWriter = new FileWriter("/home/mainuddin/IdeaProjects/bank/src/log.txt",true);
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("YYYY/MM/dd HH:MM:SS");
        LocalDateTime now = LocalDateTime.now();
        fileWriter.write("Balance = "+ balance + "Amount deducted: "+ amount+"Date and Time"+now+"\n");
        fileWriter.close();
    }
    public void withdraw(double withdrawAmount){
        try{
            if (withdrawAmount>balance){
                throw new InsufficientAmountException();
            }
            balance = balance - withdrawAmount;
            fileWrite(balance,withdrawAmount);

        } catch (Exception error) {
            System.out.println(error);
        }
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        try {
            fileWrite(balance,depositAmount);
        }catch(IOException error){
            throw new RuntimeException(error);
        }
    }

    public String getAccountNo(){
        return AccountNo;
    }
    public String getName(){
        return Name;
    }
    public String getIFSC(){
        return IFSC;
    }
    public String getBranch(){
        return branch;
    }

    public Main.typeOfAccount getTp(){
        return tp;
    }

    public double getBalance(){
        return balance;
    }

}

class InsufficientAmountException extends Exception{
    InsufficientAmountException(){

    }
    public String toString(){
        return("InsufficientAmountException: Invalid Transaction");
    }
}