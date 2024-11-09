package TransportationSystem;
public class Bike extends Transport {

    private static final int MAX_SPEED = 30;

    public Bike(String model){
        super(model);
    }

    @Override
    public void accelerate(int increment) {
        if(increment > 0){
            super.setCurrentSpeed(super.getCurrentSpeed() + increment);
        }
    }

    @Override
    public void brake(int decrement) {
        if (decrement > 0) {
            super.setCurrentSpeed(super.getCurrentSpeed() - decrement);
        }
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SPEED;
    }
    
}
