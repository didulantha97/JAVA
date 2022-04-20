abstract class Invoice {
    protected double rate;
    abstract void getRate();  
   
    public void calculateInvoice(int qty, double price){  
         System.out.println("Invoice Amount" + ((price * qty) - ((price * qty)  * rate)));  
     }  
}
