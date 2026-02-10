// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class PaymentProcessing{
    private String cardNumber;
    private double amount;
    
    public PaymentProcessing(String cardNumber,double amount){
        this.cardNumber = marksOnCard(cardNumber);
        this.amount = amount;
    }
    
    public String marksOnCard(String cardNumber){
        return ("****_****_" + cardNumber.substring(cardNumber.length() - 4));
    }
    
    public void processing(){
        System.out.println("the payment is dont through"+ " " + cardNumber + " " + "amount" + amount);
    }
}

class CardDetails {
    public static void main(String[] args) {
        PaymentProcessing pay = new PaymentProcessing("123456789",1000.00);
        pay.processing();
    }
}