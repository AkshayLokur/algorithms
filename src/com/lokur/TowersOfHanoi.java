package com.lokur;

public class TowersOfHanoi {

    public static void main(String[] args) {
        String sourceTower = "A";
        String middleTower = "B";
        String destTower = "C";

        int totalDisksToBeMoved = 3;

        moveDisks(totalDisksToBeMoved, sourceTower, destTower, middleTower);
    }


    private static void moveDisks(int n, String sourceTower, String destTower, String middleTower) {
        if(n > 0) {
            moveDisks(n-1, sourceTower, middleTower, destTower); // Move n-1 disks from "source" to "middle" using "destination" as buffer
            System.out.println("Moved disk " + n + " from '" + sourceTower + "' to '" + destTower + "'"); // Move n'th disk to "destination"
            moveDisks(n-1, middleTower, destTower, sourceTower); // Move n-1 disks from "middle" to "destination" using "source" as buffer
        }
    }
    
}
