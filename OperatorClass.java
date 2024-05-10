public class OperatorClass {
    public static void main(String[] args){
        /* Arithmetic Operators */
        int aNum1=10, aNum2=20;
        int sum=aNum1 + aNum2; //"+" is an arthimetic operator
        System.out.println("Addition is"+ sum);
        System.out.println("Substraction is"+(aNum1 - aNum2));   
        System.out.println("Multiplication is"+(aNum1 * aNum2));  
        System.out.println("Division is"+(aNum1 / aNum2));  
        System.out.println("Modulo is"+(aNum1 % aNum2));  
        /* Assigement Operator */
        int asNum1=20; //=is used to assign a value to variable
        asNum1+=1; // same as asNum1 +1;
        System.out.println("+=value is"+ asNum1);
        System.out.println("-=value is"+ (asNum1-=10));
        System.out.println("*=value is"+ (asNum1*=10));
        System.out.println("/=value is"+ (asNum1/=10));
        System.out.println("%=value is"+ (asNum1%=10));
        /* Relational Operator */
        int rNum1 =20, rNum2=21;
        boolean rExpression = rNum1 == rNum2; //returns true/false
        System.out.println("Equals to" + rExpression);
        System.out.println("Greater than"+(rNum1>rNum2));
        System.out.println("less than"+(rNum1<rNum2));
        System.out.println("Not equals to"+(rNum1 != rNum2));
        System.out.println("Greater than or equals to"+(rNum1>=rNum2));
        /*logical operator  */
        int lNum1=20, lNum2=20;
        boolean lExpression1=lNum1==lNum2;
        boolean lExpression2=lNum1>lNum2;
        System.out.println("&& is used for AND" +(lExpression1 && lExpression2));
        System.out.println("|| is used for OR" +(lExpression1 || lExpression2));
        System.out.println("! is used for NOT" +(!lExpression1));
        /*    Unary Operators */
        int uNum1=10;
        uNum1++; // uNum1 = uNum1+1;//changes value in next line
        ++uNum1; //changes value in this same line
        System.out.println("--uNum1 unary is"+ --uNum1);
        System.out.println("uNum1-- unary is"+ uNum1--);
        /*Ternary Operator */
        int tNum1 =20, tNum2=10;
        String output;
        /*take following if else as example
         * if(tNum1 > tNum2){
         * output="True Ststement";
         * }else{
         * output="False Statement";
         * }
         */
        output = tNum1 > tNum2? "True Statement": "False Statement";
        /* Here tenary operator contains expression 
         * if expression is true it returns after the "?"
         * if the expression is false it returns after the ":"" 
         */
        int intoutput=tNum2==tNum1 ? -10:10;
        System.out.println(output);
        System.out.println(intoutput);

    } 
}


