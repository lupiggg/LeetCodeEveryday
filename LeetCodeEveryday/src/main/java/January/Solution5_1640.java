package January;

import java.util.Arrays;

public class Solution5_1640 {
    public static void main(String[] args) {
        int[] arr = new int[]{49,18,16};
        int[][] pieces = new int[][]{{16,18,49}};
        System.out.println(canFormArray(arr,pieces));
    }
    public static boolean canFormArray(int[] arr, int[][] pieces) {
//        StringBuilder a = new StringBuilder(arr[0] + "");
//        for(int i = 1;i<arr.length;i++){
//            a.append(",").append(arr[i]);
//        }

        StringBuilder b = new StringBuilder();
        for(int i=0;i<pieces.length;i++){
            for (int j=0;j<pieces[i].length;j++){
                if(j==0){
                    b.append("[").append(pieces[i][j]);;
                }else {
                    b.append(",").append(pieces[i][j]);
                }
            }
            b.append("]");
        }

        int rs = 0;
        for(int i = 0;i<arr.length;i++){
            String s = arr[i]+"";
            if(b.toString().contains("["+s+"]")){
                rs++;
            }else {
                String ss = s;
                for(int j=i+1;j<arr.length;j++){
                    ss = ss +","+ arr[j];
                    if(b.toString().contains("["+ss+"]")){
                        rs++;
                        i = j;
                    }
                }
            }
        }

//        System.out.println(a);
//        System.out.println(b);
        return rs == pieces.length?true:false;
    }
}
