public class BankOfCeylon implements Bank{
    private final String bName;

    public BankOfCeylon(){
        bName = "bank of Ceylon Bank";
    }

    public String getBankName(){
        return  bName;
    }
}
