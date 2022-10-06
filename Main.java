public class Main {
    enum typeOfAccount{
        SAVINGS,
        CURRENT;
    }
    public static void main(String[] args) {
        Bank iciciBankObject = new ICICI("123","ICICI","ICIC0004182","Noida",typeOfAccount.CURRENT,10000) ;
        System.out.println(icicibankobject.getAccountNo());
        System.out.println(icicibankobject.getBalance());
        System.out.println(icicibankobject.getIFSC());
        System.out.println(icicibankobject.getTp());
        System.out.println(icicibankobject.getName());

        System.out.println(ICICI.getBankName());
        icicibankobject.deposit(1000);
        icicibankobject.withdraw(200);
        System.out.println("Remaining balance"+icicibankobject.getBalance());
    }
}