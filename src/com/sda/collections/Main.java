package com.sda.collections;

import com.sda.inheritance.Car;
import com.sda.inheritance.Colour;
import com.sda.inheritance.FuelType;
import com.sda.inheritance.Vehicle;

import java.util.*;

public class Main extends Car{

    public static void main(String[] args) {

//        showArrayListUsage();
//        showHashSetUsage();
        showHashMapUsage();







    }
    private  static void showHashMapUsage() {
        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Estonia", "Tallinn");
        countries.put("Germany", "Berlin");
        countries.entrySet();

       for (Map.Entry<String, String> countrySet : countries.entrySet()) {
            String country = countrySet.getKey();
            String capital = countrySet.getValue();
            System.out.printf("%s : %s\n", country, capital);

        }
        Map<String, List<Car>> cars = new HashMap<>();

       cars.put("SEAT", getSEATCars());
       cars.put("VOLKSWAGEN", getVolkswagenCars());

       for (Map.Entry<String, List<Car>> car : cars.entrySet()) {
           String carManufacturer = car.getKey();
           final List<Car> carList = car.getValue();
           for(Car carItem : carList) {
               System.out.println("Manufacturer: " + carManufacturer + "- Car info: " + carItem.toString());
           }
       }
    }

    private  static void showHashSetUsage() {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        System.out.println("HashSet: " + travelRoute);
        travelRoute.remove("Paris");
        System.out.println("HashSet: " + travelRoute);

        // Sorting HashSet using TreeSet
        TreeSet<String> treeSet = new TreeSet<>(travelRoute);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("TreeSet First Element: " + treeSet.first());
        System.out.println("TreeSet Last Element: " + treeSet.last());
        System.out.println(treeSet.contains("Madrid"));
//        treeSet.addAll(travelRoute); It's an alternative to initialize it doing: new TreeSet<>(travelRoute)
        final SortedSet<String> subTreeSet = treeSet.subSet("Berlin", "Madrid");
        System.out.println("SubTreeSet: " + subTreeSet);

    }

    private  static void showArrayListUsage() {

              /*  DISTINTAS POSIBILIDADES DE CREAR UN LinkedList<> objeto / instancia BASANDONOS EN
              TODA LA JERARQUIA DE CLASES VIA POLIMORFISMO
      Collection<String> collection1 = new LinkedList<>();
        Iterable<String> collection2 = new LinkedList<>();
        List<String> collection3 = new LinkedList<>();
        AbstractList<String> collection4 = new LinkedList<>();
        LinkedList<String> collection5 = new LinkedList<>();
       */


        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mercedes-Benz");
        cars.add("BMW");
        cars.add("Alfa-Romeo");
        cars.add("Skoda");

        Collections.sort(cars, Comparator.comparing(String::length).reversed());
        System.out.println(cars);
        Collections.sort(cars, Comparator.comparing(String::toString).reversed());
        System.out.println(cars);
        Collections.sort(cars, Comparator.comparing(String::toString));
        System.out.println(cars);
        System.out.println("--------------------");
//        System.out.println(cars.get(2));
//        System.out.println(cars.get(1));
//        System.out.println(cars.get(0));
//
//        cars.remove("BMW");
//
//        System.out.println(cars);

        List<Car> carList = getSEATCars();

        System.out.println("-----------Sorting by year with Comparator.comparing------------");
        Collections.sort(carList, Comparator.comparing(Vehicle::getYear).thenComparing(Vehicle::getManufacturer));
        System.out.println(carList);

//        Collections.sort(carList, Comparator.comparing(Vehicle::getManufacturer));
//        System.out.println(carList);
//        final String[] objects = (String[]) cars.toArray();
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>");
        System.out.println("List with for loop");

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
        }
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>");
        System.out.println("List with for each loop");

        List<Car> dieselCars = new ArrayList<>();

        for (Car carItem : carList) {
            if (FuelType.DIESEL.equals(carItem.getFuelType())) {
                dieselCars.add(carItem);
                System.out.println(dieselCars);
            }

//            System.out.println(carItem);
        }
        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>");
        System.out.println("List with iterator");
        final Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()) {
            System.out.println(carIterator.next());
        }
    }

    private static List<Car> getSEATCars() {
        List<Car> carList = new ArrayList<>();
        Car car = new Car();
        car.setColour(Colour.GREEN);
        car.setManual(false);
        car.setMaxSpeed(250);
        car.setModel("Ibiza");
        car.setManufacturer("SEAT");
        car.setFuelType(FuelType.GASOLINE);
        car.setYear(2000);

        Car car2 = new Car();
        car2.setColour(Colour.ORANGE);
        car2.setManual(false);
        car2.setMaxSpeed(250);
        car2.setModel("Toledo");
        car2.setManufacturer("SEAT");
        car2.setFuelType(FuelType.DIESEL);
        car2.setYear(2010);

        Car car3 = new Car();
        car3.setColour(Colour.YELLOW);
        car3.setManual(false);
        car3.setMaxSpeed(260);
        car3.setModel("Leon");
        car3.setManufacturer("SEAT");
        car3.setFuelType(FuelType.GASOLINE);
        car3.setYear(1999);

        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        return carList;
    }
    private static List<Car> getVolkswagenCars() {
        List<Car> carList = new ArrayList<>();
        Car car = new Car();
        car.setColour(Colour.GREEN);
        car.setManual(false);
        car.setMaxSpeed(250);
        car.setModel("Passat");
        car.setManufacturer("Volkswagen");
        car.setFuelType(FuelType.GASOLINE);
        car.setYear(2000);

        Car car2 = new Car();
        car2.setColour(Colour.ORANGE);
        car2.setManual(false);
        car2.setMaxSpeed(250);
        car2.setModel("Golf");
        car2.setManufacturer("Volkswagen");
        car2.setFuelType(FuelType.DIESEL);
        car2.setYear(2010);

        Car car3 = new Car();
        car3.setColour(Colour.YELLOW);
        car3.setManual(false);
        car3.setMaxSpeed(260);
        car3.setModel("Bora");
        car3.setManufacturer("Volkswagen");
        car3.setFuelType(FuelType.GASOLINE);
        car3.setYear(1999);

        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        return carList;
    }
}
