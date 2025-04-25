package Interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void printVolumes(ArrayList<WaterBottle> waterBottles) {
        for (WaterBottle bottle : waterBottles) {
            System.out.println("> " + bottle.getVolume() + " mL");
        }
    }

    public static void main(String[] args) {
        ArrayList<WaterBottle> waterBottles = new ArrayList<WaterBottle>();
        waterBottles.add(new WaterBottle(500));
        waterBottles.add(new WaterBottle(250));
        waterBottles.add(new WaterBottle(300));
        waterBottles.add(new WaterBottle(200));
        waterBottles.add(new WaterBottle(225));
        waterBottles.add(new WaterBottle(100));
        waterBottles.add(new WaterBottle(350));
        waterBottles.add(new WaterBottle(550));
        waterBottles.add(new WaterBottle(50));
        waterBottles.add(new WaterBottle(400));

        // Unsorted
        System.out.println("=== Unsorted ===");
        printVolumes(waterBottles);

       // Sorted 
        System.out.println("==== Sorted ====");
        Collections.sort(waterBottles);
        printVolumes(waterBottles);
        
        System.out.println("================");
    }
}
