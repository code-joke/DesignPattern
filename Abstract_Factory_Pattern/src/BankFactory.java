public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        if(bank.equalsIgnoreCase("ABBank")){
            return new ABBank();
        } else if(bank.equalsIgnoreCase("MBBank")){
            return new MBBank();
        } else if(bank.equalsIgnoreCase("VPBank")){
            return new VPBank();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
