import java.util.*;
class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int[] reservedSeat:reservedSeats){
            map.put(reservedSeat[0],new ArrayList<>());
        }
        for(int[] reservedSeat:reservedSeats){
            int row = reservedSeat[0];
            int seat = reservedSeat[1];
            map.get(row).add(seat);
        }
        int count = 0 ;
        for(int row : map.keySet()){
            ArrayList<Integer> list = map.get(row);
            boolean left = false, right = false, middle = false ;
            if(!list.contains(2) && !list.contains(3) && !list.contains(4) && !list.contains(5) ) left = true ;
            if(!list.contains(4) && !list.contains(5) && !list.contains(6) && !list.contains(7) ) middle = true ;
            if(!list.contains(6) && !list.contains(7) && !list.contains(8) && !list.contains(9) ) right = true ;
            if(left && right) count += 2;
            else if(left||right||middle ) count++;
            else count  += 0 ;
        }
        count += (n - map.size()) * 2;
        return count ;
    }
}