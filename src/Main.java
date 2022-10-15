public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStationImpl station = new ServiceStationImpl();
        station.check(car);
        car.checkEngine();
        station.check(car2);
        car2.checkEngine();
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        truck.checkEngine();
        truck.checkTrailer();
        station.check(truck2);
        truck2.checkEngine();
        truck2.checkTrailer();
    }
}