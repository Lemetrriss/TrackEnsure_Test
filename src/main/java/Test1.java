/**
 * @author Dmitrenko Dmitrij
 * @version .1
 * The class counts the number of COMPLETE lines according to the line number.
 * All incomplete lines are ignored.
 * The rest is cut off.
 */

class Test1 {

    /**
     *
     * @param n - total number of points from which we are builds our staircase
     * @return the value of complete rows
     */
    public int test(int n){
        int rows = 0;
        for (int i=1; ; i++){
            if (n>=i) {
                rows++;
                n = n-i;
            } else break;

        }
        return rows;
    }
}
