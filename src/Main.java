public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 1;
        int intOperandB = 7;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotent;
        int intModulo;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotent = intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotent);

        intModulo = intOperandA % intOperandB;
        System.out.println("The Modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo);


        double doubleOperandA = 12.75;
        double doubleOperandB = 7.5;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotent;
        double doubleModulo;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotent = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotent);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The Modulo of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);

        int kids = 3;
        String isItRaining = "Yes";
        double gasPrice = 3.450;
        int favNum = 7;
        int shoeSize = 47;
        int birthMonth = 8;
        String fullName = "Long H Nguyen";

        System.out.println("The number of kids in my family is " + kids);
        System.out.println(isItRaining + ", it is raining");
        System.out.println("The price of a gallon of gas is " + gasPrice);
        System.out.println("My favorite number is " + favNum);
        System.out.println("My shoes size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My full name is " + fullName);
    }
}