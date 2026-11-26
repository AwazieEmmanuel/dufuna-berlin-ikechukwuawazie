
package com.dufuna.berlin.ikechukwuawazie.lekki;

import java.util.ArrayDeque;
import java.util.Queue;

public class PropertyInspectionQueue {

    public static void main(String[] args) {

        Queue<String> inspectionQueue = new ArrayDeque<>();

        inspectionQueue.add("Lekki Apartment");
        inspectionQueue.add("Ikoyi Duplex");
        inspectionQueue.add("Victoria Island Flat");

        System.out.println("Inspection queue: " + inspectionQueue);

        System.out.println("Next property: " + inspectionQueue.peek());

        System.out.println("Processing: " + inspectionQueue.poll());

        System.out.println("Remaining properties: " + inspectionQueue);

        System.out.println("Properties waiting: " + inspectionQueue.size());
    }
}
