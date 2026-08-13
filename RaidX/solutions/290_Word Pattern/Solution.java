import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false ;
        HashMap<Character , String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        for(int i = 0 ;i < words.length ; i++){
            if( !(map1.containsKey(pattern.charAt(i))) && !(map2.containsKey(words[i]) )  ){
                map1.put(pattern.charAt(i),words[i]);
                map2.put(words[i],pattern.charAt(i));
            }

            else if( ((map1.containsKey(pattern.charAt(i))) && !(map2.containsKey(words[i])) || !((map1.containsKey(pattern.charAt(i))) && (map2.containsKey(words[i]))) ) ) return false ;
            
            else if( !map1.get(pattern.charAt(i)).equals(words[i])  || map2.get(words[i]) != pattern.charAt(i)) return false ;
        }
        return true ;
    }
}