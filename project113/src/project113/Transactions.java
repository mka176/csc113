package project113;

public class Transactions {
   private int transactionID;
   private double Amount;
   private String Date;
   public Transactions (int id,double amount,String date){
      transactionID=id;   
      Amount=amount;
      Date=date;
   }
   public String invoice(){
      String result = "--------------------------------------------\n" +
                    "              ATM TRANSACTION               \n" +
                    "--------------------------------------------\n" +
                    "Transaction ID : " + transactionID + "\n" +
                    "Amount : " + Amount + "\n" +
                    "Date : " + Date + "\n" +
                    "--------------------------------------------\n";
      return result;
   }
   public int getTransactionID() {
      return transactionID;
   }
   public void setTransactionID(int transactionID) {
      this.transactionID = transactionID;
   }
   public double getAmount() {
      return Amount;
   }
   public void setAmount(double amount) {
      Amount = amount;
   }
	   
	    
}


