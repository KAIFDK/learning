// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BankAccount{
    private double balance;
    
    public void deposit(double amount){
        if(amount <= 0){
            throw  new IllegalArgumentException("Please enter positive amount");
        }
        balance += amount;
    }
    
    public void withdraw(double amount){
        if(balance <= 0){
            throw new IllegalArgumentException("Don't have enough money to withdraw money");
        }
        balance -= amount;
    }
    
    public double getBalance(){
        return balance;
    }
}

class ATM {
    public static void main(String[] args) {
        BankAccount atm = new BankAccount();
        atm.deposit(1000.00);
        atm.withdraw(500.00);
        System.out.println(atm.getBalance());
    }
}