public class ArrayLoop {
    public static void main(String[] args) {
        // int[] arr = new int[4];
        // arr[0]=-10;
        // arr[1]=0;
        // arr[2]=10;
        // arr[3]=20;

        // /* We need length of array first, use . length */
        // int arrayLength = arr.length;
        // /* Loop from 0 -(arrayLength - 1), 0-3 */
        // for(int index = 0; index < arrayLength; index ++){
        //     System.out.println(arr[index]); 
        // }
        // //or, use condition, index <= arrayLength - 1
        // System.out.println("Descending loop");
        // for(int index=arrayLength - 1; index>=0; index--){
        //     System.out.println(arr[index]);
        // }

        /* Loop the arr using while loop */

        /*  
         * Make an array of ["Jhon", "Doe", "Foo", "Bar"]
         * Make a String "Foo"
         * Loop the array and find in which index is "Foo" on
         * Print the index
         */

         /* Make the function for the above name arrayFinder
          * Takes array of String and String as parameter
          * return index if second argument value matches any element of array
          * else return -1
          * print the returned index value
          */

          String[] name= {"john", "doe", "foo", "bar"};
          int i=0;
          while(i<name.length){
            if(name[i]=="foo"){
                System.out.println(i);
            }
            i++;
          }



    }
}


