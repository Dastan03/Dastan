public class Main {
        public static void main(String[] args) {
            Vehicle passengerCar1 = new PassengerCar("Лада", 60, 40, true);
            Vehicle suv1 = new SUV("Hammer", 85, false, 80);
            Vehicle motorcycle1 = new Motorcycle("Harley Davidson", 80, 100, false);
            Vehicle passengerCar2 = new PassengerCar("Ламба", 150, 100, true);

            Vehicle[] vehicles = {passengerCar1, suv1, motorcycle1, passengerCar2};

            TransportSorter ts = new TransportSorter(vehicles);
            ts.print();
            ts.sort();
        }
    }
