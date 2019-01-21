package com.company;

public class Main {

    public static void main(String[] args) {
        int[] thistrail = {3,6,1,4};
	Trail trail = new Trail(thistrail);
	System.out.println("Is the trail level?"  + trail.isLevelTrailSegment(1,3));
    System.out.println("Is the trail difficult? " + trail.isDifficult());
    }
}
