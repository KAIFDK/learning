abstract class Vehicle{
    String brand;

    public Vehicle(String brand){
        this.brand  = brand;
    }

    public abstract void start();

    public String getBrand(){
        return brand;
    }
}

class Car extends Vehicle{
    Car(String brand){
        super(brand);
    }

    @Override
    public void start(){
        System.out.println("Car is Starting");
    }

}

class VehicleDetails{
    public static void main(String[] args){

        Vehicle obj = new Car("Toyota");
        obj.start();
        System.out.println(obj.getBrand());
    }
}