/**
 * @author Dmitrenko Dmitrij
 * @version 0.1
 * Class counts all possible sqares and searches MAX value of the triangles square
 */
class Test2 {
    /**
     *
     * @param H - array of dots which gives us (n) number of lines with coordinates (i; ai)
     * @return MAX value of triangles square
     */
    public int test(int[] H){
        int result = 0;
        for (int i=0; i<H.length; i++){
            for (int j = i+1; j<H.length; j++){
                int temp = H[i]>=H[j] ? H[j] * (j-i) : H[i] * (j-i);
                if (temp>result) result=temp;
            }
        }
        return result;
    }
}
