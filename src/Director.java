public class Director {

    Car build(AbstractCar abstractCar) {
        abstractCar.createCar();
        abstractCar.buildDoor();
        abstractCar.buildName();
        abstractCar.buildColor();
        abstractCar.buildSpeed();
        return abstractCar.get();
    }
}
