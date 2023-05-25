public class ABBank implements Bank {
    private final String BNAME;

    public ABBank() {
        BNAME = "ABBank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
