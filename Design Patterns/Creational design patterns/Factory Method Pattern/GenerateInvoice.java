import java.io.*;  
class GenerateInvoice {
   public static void main(String[] args) throws IOException {
        
        getInvoiceFactory invFactory = new getInvoiceFactory();
        
        System.out.println("Enter Inovice Type (Dealer/ wholesaler/ Customer) - ");
        
        BufferedReader type = new BufferedReader(new InputStreamReader(System.in));
        String invType = type.readLine();

        System.out.println("Enter Qty : ");
        
        BufferedReader qty = new BufferedReader(new InputStreamReader(System.in));
        int qom = Integer.parseInt(qty.readLine());

        System.out.println("Enter Price : ");
        
        BufferedReader price = new BufferedReader(new InputStreamReader(System.in));
        double invPrice = Double.valueOf(price.readLine()).doubleValue();

        Invoice in = invFactory.getInvoice(invType);
        
        System.out.print("Bill amount for "+invType+" of  "+qom+" units is: " + "Price : " + invPrice);  

        System.out.println("\n");
            
        in.getRate();  
        in.calculateInvoice(qom,invPrice);  
          


    }
}
