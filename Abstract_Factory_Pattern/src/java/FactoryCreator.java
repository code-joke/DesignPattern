package java;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("java.Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("java.Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
