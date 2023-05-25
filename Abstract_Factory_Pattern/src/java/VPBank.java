package java;

public class VPBank implements Bank {
    private final String BNAME;

    public VPBank() {
        BNAME = "java.VPBank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
