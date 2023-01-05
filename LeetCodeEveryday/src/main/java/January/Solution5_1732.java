package January;

public class Solution5_1732 {
    public static void main(String[] args) {
        int[] a = new int[]{-5,1,5,0,-7};
        System.out.println(largestAltitude(a));
    }

    //[-5,1,5,0,-7] 1
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int tmp = 0;
        for (int h:gain) {
            int s = h+tmp;
            if(s>max){
                max = s;
            }
            tmp = tmp +h;
        }
        return max;
    }
}
