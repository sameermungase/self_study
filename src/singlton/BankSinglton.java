package singlton;

public class BankSinglton {
    String bankName;
    String balance = "1 Crore";

    static BankSinglton object;

    private BankSinglton() {
        this.bankName = "SBI";
    }

     public static BankSinglton getBankSingletonObject() {
        if (object == null) {
            object = new BankSinglton();
        }
        return object;
    }

    public void whatIsMyBank() {
        System.out.println("My bank name is " + this.bankName);
    }

//    @Override
//    public String toString() {
//        return "BankSinglton{" +
//                "bankName='" + bankName + '\'' +
//                '}';
//    }
}
