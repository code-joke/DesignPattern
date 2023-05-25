public class VPBank implements Bank {
    private final String BNAME;

    public VPBank() {
        BNAME = "VPBank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
