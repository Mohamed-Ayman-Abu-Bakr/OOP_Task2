public class Car extends Vehicle{
    private String carName, carColor;
    private int fuel;
    public Car(String carName,String carColor, int currentSpeed,int maxSpeed){
        super(currentSpeed,maxSpeed);
        this.carName = carName;
        this.carColor = carColor;
        this.fuel = 100;
    }
    public Car(String carName,String carColor, int currentSpeed,int maxSpeed,int fuel){
        super(currentSpeed,maxSpeed);
        this.carName = carName;
        this.carColor = carColor;
        this.fuel=fuel;
    }
    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }


    @Override
    public int getFuel() {
        return this.fuel;
    }
}