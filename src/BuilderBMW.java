public  class BuilderBMW extends AbstractCar {

    @Override
    void buildSpeed() {
        car.setSpeed(250);
    }

    @Override
    void buildColor() {
        car.setColor("Silver");

    }

    @Override
    void buildName() {
        car.setName("BMW");

    }

    @Override
    void buildDoor() {
        car.setNumberDoors(4);

    }
}
