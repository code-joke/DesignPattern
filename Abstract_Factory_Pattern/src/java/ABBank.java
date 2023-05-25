package java;

public class ABBank implements Bank {
    private final String BNAME;

    public ABBank() {
        BNAME = "java.ABBank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
