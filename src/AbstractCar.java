public abstract class AbstractCar {
    Car car;
    void  createCar() {

        car = new Car();
    }
    abstract  void buildSpeed ();

    abstract  void buildColor ();
    abstract   void buildName ();
    abstract  void buildDoor ();
    Car get () {
        return car;
    }
}
