class getInvoiceFactory {

    public Invoice getInvoice(String invType) {
        if(invType.equalsIgnoreCase("Dealer")){
            return new DealerInvoice();
        }else if(invType.equalsIgnoreCase("wholesaler")){
            return new WholesalerInvoice();
        }else if(invType.equalsIgnoreCase("Customer")){
            return new CustomerInvoice();
        }else{
            return null;
        }
    }
    
}
