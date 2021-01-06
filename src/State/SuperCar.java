package State;

public class SuperCar {

    DriveState state;

    SuperCar(DriveState state){
        this.state = state;
    }

    public void switchToWater(){
        this.state = new Water();

    }

    public void switchToLand(){
        this.state = new Land();
    }

    public String superDrive(int amount){
        return state.drive(amount);

    }


    public  static void main(String[] args){
        SuperCar volvo = new SuperCar(new Land());
        volvo.switchToWater();
        System.out.println(volvo.superDrive(2));
        volvo.switchToLand();
        System.out.println(volvo.superDrive(10));
    }
}
