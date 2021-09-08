public abstract class Vehicle {
    private int currentSpeed;
    private int maxSpeed;

    public Vehicle (int currentSpeed, int maxSpeed){
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract int getFuel();

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}