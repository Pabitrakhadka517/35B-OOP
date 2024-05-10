// public class First{
//     /*Instance variable
//      * Access with object
//      * Is not shared with other object
//      */
//     int instanceVariable=120;
//     /* Static variable
//      * Access with Class
//      * Is shared with other object 
//      */
//     static int staticVariale = 100;
//         public static void main(String[] args){
//         /* Non primitive data type */
//         /* Declaration */
//         byte byteValue;
//         /* Initialization */
//         byteValue=10;
//         /* Declaration and Intialization */
//         short shortValue=100;
//         /* Multiple Declaration */
//         int intValue1, intValue2;
//         /* Multiple Initialization */
//         intValue1=-99; intValue2=99;
//         /*Multiple Declaration and Initilazation */
//         long longValue=-999, longValue2=999;
//         float floatValue=1.90f; // the letter 'f' is required
//         double doubleValue=28.88d; //the value 'd' is optional
//         char charValue='c'; //single letter in single quote
//         boolean booleanValue=false; //false//true lowercase

//         /*Non primitive Data type */
//         /*String */
//         String stringInfo1="This is a variable";
//         /*Using Class */
//         String stringInfo2= new String("Class");
//         /*Object use the same class as written above */
//         First variableObj=new First();

//         /*Illegal actions following */
//         /* byte byteValue = 10;// You cannot redeclare */
//         /* byte byteValue = 20; //instead reassign */
//         /*boolean boolvall3='false';//wrong data type
//         * short shortVal=10000000; //cannot exceed min/max 
//         */
//         /* We need to use object to access instance variable */
//         System.out.println(variableObj.instanceVariable);
//         /* We can access the staticc variable with class */
//         System.out.println(First.staticVariale);

//         /*Type casting */
//         /*Implicit type casting (automatic)
//          * from smaller type to larger type */
//         int intValueConvert=10;
//         double intValueConvertToDouble=intValueConvert;
//         /*Explict type casting (manual) */
//         double doubleValueConvert=19.23d;
//         int doubleValueConvertToInt=(int) doubleValue;



//     }

// }