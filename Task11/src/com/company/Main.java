package com.company;
import java.util.*;

public class Main {

    private static int[] intArray = new int[10];

    public static void main(String[] args) {

    }

    private static void firstTaskExecute() {


        Car a1 = new Car(1999, "a");
        Car a2 = new Car(1888, "s");
        Car a3 = new Car(1777, "d");
        Car a4 = new Car(6363, "f");
        Car a5 = new Car(7455, "g");
        Car a6 = new Car(6456, "h");
        Car a7 = new Car(5656, "j");
        Car a8 = new Car(2222, "k");
        Car a9 = new Car(1111, "l");
        Car a10 = new Car(7777, "x");


        List<Car> cars = new ArrayList<>();

        cars.add(a1);
        cars.add(a2);
        cars.add(a3);
        cars.add(a4);
        cars.add(a5);
        cars.add(a6);
        cars.add(a7);
        cars.add(a8);
        cars.add(a9);
        cars.add(a10);

        System.out.println("sorting");
        for (Car car : cars) {
            System.out.println(car);
        }

        Collections.sort(cars);
        System.out.println("sorted");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void secondTaskExecute() {
        Item b1 = new Item("q", 4455);
        Item b2 = new Item("w", 5853);
        Item b3 = new Item("l", 4484);
        Item b4 = new Item("t", 7459);
        Item b5 = new Item("e", 8895);
        Item b6 = new Item("w", 7486);

        List<Item> items = new ArrayList<>();

        items.add(b1);
        items.add(b2);
        items.add(b3);
        items.add(b4);
        items.add(b5);
        items.add(b6);

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
        Map<Integer, String> map = new HashMap();
        for (Item item : items) {
            map.put(item.getID(), item.getName());
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

    public static void fourthTaskExecute() {
        fillArray();
    }
    private static int readNumber() throws NegativeNumberException {
        System.out.println("number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("not negative");
        } else {
            return number;
        }
    }
    private static void fillArray() {
        for (int i = 0; i < intArray.length; i++) {
            try {
                intArray[i] = readNumber();
            } catch (NegativeNumberException e) {
                intArray[i] = 0;
                e.printStackTrace();
            }
        }
        System.out.println("chosen value:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    private static void thirdTaskExecute() {
        Item i1 = new Item("h", 7485);
        Item i2 = new Item("s", 7485);
        Item i3 = new Item("i", 8459);
        Item i4 = new Item("j", 2346);
        Item i5 = new Item("a", 6685);
        Item i6 = new Item("y", 9065);
        Item i7 = new Item("s", 4595);
        Item i8 = new Item("e", 8496);
        Item i9 = new Item("t", 2496);
        Item i10 = new Item("e", 1276);

        List<Item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);
        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(i10);
        List<Item> subList = items.subList(1, 2);
        Set<Item> itemSet = new HashSet<>(subList);

        for (Item item : itemSet) {
            System.out.println(item.getName());
        }
    }
}

