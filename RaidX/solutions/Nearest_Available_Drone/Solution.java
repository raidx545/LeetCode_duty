package solutions.Nearest_Available_Drone;

public class Solution {

        public int nearestDrone(int[][] drones, int[] target) {
        int min_index = -1 ;
        long min_distance = Long.MAX_VALUE ;
        int elements = drones.length;
        for(int i = 0 ; i < drones.length ; i++ ){
            int[] drone = drones[i];
            long distance = Math.abs((long) target[0] - drone[0]) + Math.abs((long) target[1] - drone[1]);
            if(distance<= drone[2] && distance < min_distance) {min_index = i ; min_distance = distance ;}
        }
        return min_index ;
    }
}