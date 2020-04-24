package com.sda.generics;

public class Main {
    public static void main(String[] args) {
       /* Car car = new Car();
        Bus bus = new Bus();
        GenericBox genericBox = new GenericBox(car);
        GenericBox<Car> boxWithACarInIt = new GenericBox<>(car);
        GenericBox<Bus> boxWithABusInIt = new GenericBox<>(bus);

        boxWithACarInIt.getItem();
        boxWithABusInIt.getItem();

        */

       Truck truck = new Truck();
//       RepairingGarage<Truck> truckInRepairingGarage = new RepairingGarage<>(truck);
//       truckInRepairingGarage.repairMyVehicle();
//       truck.repair();
        repair(truck);

       Plane plane = new Plane();
//       RepairingGarage<Plane> planeInRepairingGarage = new RepairingGarage<>(plane);
//       planeInRepairingGarage.repairMyVehicle();
//       plane.repair();
        repair(plane);

        comparePlaneSpeeds();
        compareTruckNames();
    }

    private static void compareTruckNames() {
        System.out.println("-------------");
        Truck truck = new Truck();
        truck.setTruckName("East Eagle");
        truck.setMaxSpeed(200);
        Truck truck1 = new Truck();
        truck.setTruckName("Black Hawk");
        truck.setMaxSpeed(180);

        truck.compareTo(truck1);
        System.out.println("==============");
    }

    private static void comparePlaneSpeeds() {
        Plane plane = new Plane();
        plane.setMaxSpeed(700);
        Plane plane1 = new Plane();
        plane1.setMaxSpeed(800);

        plane.compareTo(plane1);
        plane1.compareTo(plane);
        plane1.compareTo(plane1);
    }

    private static void repair(AbstractVehicle abstractVehicle) {
        RepairingGarage<AbstractVehicle> abstractVehicleRepairingGarage = new RepairingGarage<>(abstractVehicle);
        abstractVehicleRepairingGarage.repairMyVehicle();
        abstractVehicle.garbage();
    }
    private static void repair(Truck truck) {
       truck.repair();
    }
    private static void repair(Plane plane) {
        plane.repair();
    }

}
