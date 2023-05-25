package java;

public class MBBank implements Bank {
    private final String BNAME;

    public MBBank() {
        BNAME = "java.MBBank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
