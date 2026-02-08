// Online Java Compiler
// Use this editor to write, compile and run your Java code online

interface paymentGateway{
    void intiatePayment(double amount);
}

class razorPay implements paymentGateway{
    public void intiatePayment(double amount){
        System.out.println("payment via razorPay" + " " + amount);
    }
}

class stripPay implements paymentGateway{
    public void intiatePayment(double amount){
        System.out.println("payment via stripPay" + " " + amount);
    }
}

class checkoutService{
    private paymentGateway paymentGateway;
    
    public checkoutService(paymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    
    public void setCheckout(paymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }
    
    public void checkout(double amount){
        paymentGateway.intiatePayment(amount); 
    }
}


class Main {
    public static void main(String[] args) {
        paymentGateway stripPayment = new stripPay();
        checkoutService service = new checkoutService(stripPayment);
        service.checkout(120.50);
        
        paymentGateway razorPayment = new razorPay();
        service.setCheckout(razorPayment);
        service.checkout(128.50);
    }
}
