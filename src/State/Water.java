package State;

public class Water implements DriveState {


    @Override
    public String drive(int amount) {
        return "Car goes " + amount + " on water!";
    }
}
