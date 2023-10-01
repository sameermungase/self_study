package singlton;

public class Test {

    public static void main (String [] ajit){
        BankSinglton bank;
        bank = BankSinglton.getBankSingletonObject();
        bank.whatIsMyBank();

        BankSinglton bank2 = BankSinglton.getBankSingletonObject();
        BankSinglton bank3 = BankSinglton.getBankSingletonObject();
        BankSinglton bank4 = BankSinglton.getBankSingletonObject();
        bank2.whatIsMyBank();
        System.out.println(bank);
        System.out.println(bank2);System.out.println(bank3);System.out.println(bank4);
    }
}
