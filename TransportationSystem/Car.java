package TransportationSystem;

public class Car extends Transport {    

    private static final int MAX_SPEED = 180;
    private final String combustionType;

    public Car(String model, String combustionType){
        super(model);
        this.combustionType = combustionType;
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

    public String getCombustionType(){
        return combustionType;
    }
}
