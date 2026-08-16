package solutions.Minimize_The_Maximum_Waiting_Time_At_Synchronized_Traffic_Lights;

public class Solution {

    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int M = 0 ;
        for(int L : lights) M = Math.max(M,L);
        int maxWait = 0 ;
        for(int a : arrivalTime){
            int r = a % period ;
            if(r>=M) maxWait = Math.max(maxWait,period-r);
        }
        return maxWait ;
        
    }
}