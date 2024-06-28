public class PrefixPostfix {
    public static void main(String[] args) {
        // int prefixValue=10;
        // System.out.println("Prefix will update here"+ ++prefixValue);
        // System.out.println("It will remain the same"+ prefixValue);
        // /* Prefix is when you put operator in the left side of value/var */

        // int postFixValue = 20;
        // System.out.println("Postfix will not update here"+ postFixValue++);
        // System.out.println("It will update here" + postFixValue);
        // /* Postfix is when you put operator in the right side */

        int a, b, c, d;
        a=7;
        b=4;
        c=a + ++b;
        System.out.println(c);
        d=a - --b;
        System.out.println(d);

    }
} 
