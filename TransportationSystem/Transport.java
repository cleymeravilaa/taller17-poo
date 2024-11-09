package TransportationSystem;

public abstract class Transport {

    protected String model;
    protected int currentSpeed;

    public Transport(String model){
        this.model = model;
        this.currentSpeed = 0;
    }
    
    public String getModel(){
        return model;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }


    public abstract void accelerate(int increment);
    public abstract void brake(int decrement);
    public abstract int getMaxSpeed(); 

    protected void setCurrentSpeed(int newSpeed){
        if(newSpeed < 0){
            newSpeed = getMaxSpeed();
        } else if (newSpeed > getMaxSpeed()) {
            this.currentSpeed = getMaxSpeed();
        } else {
            this.currentSpeed = newSpeed;
        }
    }
}
