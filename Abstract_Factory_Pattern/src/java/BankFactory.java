package java;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        if(bank.equalsIgnoreCase("java.ABBank")){
            return new ABBank();
        } else if(bank.equalsIgnoreCase("java.MBBank")){
            return new MBBank();
        } else if(bank.equalsIgnoreCase("java.VPBank")){
            return new VPBank();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
