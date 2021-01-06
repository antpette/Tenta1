package State;

public class Land implements DriveState {

    @Override
    public String drive(int amount) {
        return "Car goes " + amount + " on land!";
    }
}
