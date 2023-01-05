package January;

import java.util.ArrayList;
import java.util.Collection;

public class Solution5_1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }

    public static boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2);
        int aRS=0,bRS = 0;
        String[] map = new String[]{"a","A","e","E","i","I","o","O","u","U"};
        return aRS==bRS?true:false;
    }

//    public static boolean halvesAreAlike(String s) {
//        String a = s.substring(0,s.length()/2);
//        String b = s.substring(s.length()/2);
//        int aRS = 0;
//        int bRS = 0;
//        List<String> map = new ArrayList<>();
//        map.add("a");
//        map.add("A");
//        map.add("e");
//        map.add("E");
//        map.add("i");
//        map.add("I");
//        map.add("o");
//        map.add("O");
//        map.add("u");
//        map.add("U");
//        for(char i:a.toCharArray()){
//            if(map.contains(i+"")){
//                aRS += 1;
//            }
//        }
//        for(char i:b.toCharArray()){
//            if(map.contains(i+"")){
//                bRS += 1;
//            }
//        }
//        return aRS==bRS?true:false;
//    }
}
