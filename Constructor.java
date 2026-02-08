class Car{
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void accelerator(int increment){
        speed += increment;
    }

    public int getSpeed(){
        return speed;
    }

    public String getDetails(){
        return brand + " " + model;
    }
}


class Constructor{
    public static void main(String[] args){
        Car c = new Car("Toyota" , "2013");
        c.accelerator(150);
        System.out.println(c.getDetails() + " " + c.getSpeed());
    }
}