public class ForLoop {
    public static void main(String[] args) {
        /* For loop takes initialization
         * condition
         * modify/update */
         for(int index=0; index<=5; index ++){
            System.out.println(" For Index" + index);
         }
         /* can use different update lodic like
          * for(int index=0; index<=5 ; index +=3) */

          /* Using decrement */          
          for(int index=10; index>=0; index --){
            System.out.println("For Index Decrement" + index);

          }

          /* Task
        * make  multiplication table of 2
        * for eg:
        * 2*1=2
        * 2*2=4
        * ...
        * 2*10=20
        * Note: Loop from 1 to 10 and multily th index
         */

         for (int index=1; index<=10; index++){
            System.out.println("2 *" + index + "=" + index * 2);
         }
           

            /* Nested for loop
             * Using for loop inside the scope of for loop */
            for(int outer=0; outer <2; outer ++){
                for(int inner=3; inner > 0; inner --){
                    System.out.println("Inner Index" + inner);

                }
                System.out.println("Outer Index" + outer);
            }


            /* task
             * make a multiplication table like the following
             *  multiplication table of 10
             * 10 * 1=10
             * ...
             * 10 * 10=100
             * ..
             * Multiplication table of 1
             * 1 * 1=1
             * ..
             * 1*10=10
             */
            // for(int outer=1; outer <=10; outer ++){
            //     for(int inner=1; inner <=10; inner ++){
            //         System.out.println("1 x " + inner +"=" + inner*1);

            //     }
            //     System.out.println("10 x" + outer +"=" + outer*10);
            // }


            for(int outer=10; outer >=1; outer --){
                System.out.println("Multiplication of"+outer);
                for(int inner=1; inner<=10; inner ++){
                    System.out.println(outer);
                    System.out.println("x");
                    System.out.println(inner);
                    System.out.println("=");
                    System.out.println(inner * outer);
                }
            }

        
  
          


    }
    
}

  
