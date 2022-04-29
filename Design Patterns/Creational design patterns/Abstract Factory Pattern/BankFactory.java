public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bank) {
        // TODO Auto-generated method stub
        if(bank == null){
            return null;
        }
        else if(bank.equalsIgnoreCase("Sampath")){
            return new Sampath();
        }
        else if(bank.equalsIgnoreCase("Commercial")){
            return new Commercial();
        }
        else if(bank.equalsIgnoreCase("BankOfCeylon")){
            return new BankOfCeylon();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
