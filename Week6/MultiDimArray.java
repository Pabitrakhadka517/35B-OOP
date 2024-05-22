public class MultiDimArray {
    public static void main(String[] args) {
        /* One D array, one sqquare bracket [] */
        int[] oneDArray;
        /* Two D array, two square bracket [][] */
        int [][] twoDArray;
        /* Three D array, three square bracket [][][] */
        int [][][] threeDArray;

        /* Memory alloc, must give to each dimension */
        twoDArray = new int[2][3];
        /* Visual
         * [
         *   [0,0,0], ->0
         *   [0,0,0], ->1
         * ]
         */
        // twoDArray[0] -> access the 0th index array
        twoDArray[0][0]=10;
        twoDArray[0][1]=20;
        twoDArray[1][0]=100;
        twoDArray[1][2]=200;
        //Access in variable
        int arrayElement = twoDArray[0][0];
        System.out.println(arrayElement);
        System.out.println(twoDArray[0][1]);

        /* Make the following array
         * [
         * [10, -10],
         * [20, -20],
         * [-30, 8],
         * [40, 45],
         * [50,56]
         * ]
         * Print the value
         * 50, 56
         */
        // int [][] arrTwo = {
        //     {10, -10},
        //     {20, -20},
        //     {-30, 8},
        //     {40, 45},
        //     {50,56},
        //     }
        // }

    }
}
