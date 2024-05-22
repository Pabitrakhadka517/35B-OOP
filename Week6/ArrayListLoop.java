import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        /* Import ArrayList on top, import java.util.ArrayList */
        ArrayList<Integer> intArr= new ArrayList<>();
        intArr.add(10);
        intArr.add(20);
        intArr.add(30);
        intArr.add(50);
        /* To loop ArrayList, same as array, get length/size first */
        /* To get length use .size() */
        int arrLen = intArr.size();
        /* Loop from 0 to size/len -1 */
        for(int index=0; index < arrLen; index ++) {
            System.out.println("Index" + index + "value" + intArr.get(index));
        }

        //Using for each
        for(Integer element: intArr){
            System.out.println(element);
        }

        /* Make an ArrayList as student as following
         * ["Aruna", "Shreeya", "Yudip", "Anjali", "Nischcay", "Krishna"]
         * Make 2 another ArrayList males and females
         * Loop the students ArrayList
         * add "Yudip", "Nischay" and "Krishna" in males
         * add "Aruna", "Shreeya", and "Anjali" in females
         * print Anjali from females
         * print Yudip from males
         */

    }
}