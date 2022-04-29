public class Commercial implements Bank{
    private final String bName;

    public Commercial(){
        bName = "Commercial Bank";
    }

    public String getBankName(){
        return  bName;
    }
}
