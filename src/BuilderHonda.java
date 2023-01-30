public class BuilderHonda extends AbstractCar {
    @Override
    void buildSpeed() {
        car.setSpeed(180);
    }

    @Override
    void buildColor() {
        car.setName("Black");

    }

    @Override
    void buildName() {
        car.setColor("Honda");

    }

    @Override
    void buildDoor() {
        car.setNumberDoors(4);

    }
}
