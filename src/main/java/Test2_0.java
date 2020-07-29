/**
 * @deprecated
 */

public class Test2_0 {
    public int test(int[] H){
        int square = 0;
        for (int i=0; i<H.length; i++){
            int start = i;
            int end = i;
            while (start>0 && H[start-1]>=H[i]){
                start--;
            }
            while (end<H.length-1 && H[end+1]>=H[i]){
                end++;
            }
            int temp = H[i] * (end-start+1);
            if (temp>square) square=temp;
        }
        return square;
    }

    public static void main(String[] args) {
        Test2_0 t = new Test2_0();
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        int result = t.test(arr);
        System.out.println(result);
    }
}
