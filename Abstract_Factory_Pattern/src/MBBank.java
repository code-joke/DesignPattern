public class MBBank implements Bank {
    private final String BNAME;

    public MBBank() {
        BNAME = "MBBank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
