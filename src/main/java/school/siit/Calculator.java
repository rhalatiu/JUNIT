package school.siit;

import java.util.Scanner;

public class Calculator {

    private static String addedValues;

    public static void main(String[] args) {

        System.out.println("Introduceti valorile");
        Scanner values = new Scanner(System.in);
        addedValues = values.nextLine();
        System.out.println(addedValues);
        Calculator.calculate(addedValues);
    }

    public static int calculate(String addedValues){
        int sum = 0;

        if (addedValues.substring(0, 0) != "+" || addedValues.substring(0, 0) != "-"){
            addedValues = "+ " + addedValues;
        }
        if (addedValues.substring(addedValues.length(), addedValues.length()) != " "){
            addedValues = addedValues + " ";
        }

        do {
            String operator = addedValues.substring(0, addedValues.indexOf(" "));
            System.out.println(operator);
            addedValues = addedValues.substring(addedValues.indexOf(" "), addedValues.length());
            addedValues = addedValues.substring(1);

            String savedString = addedValues.substring(0, addedValues.indexOf(" "));
            System.out.println(savedString);
            int value = Integer.parseInt(savedString);
            System.out.println(value + " int");
            addedValues = addedValues.substring(addedValues.indexOf(" "), addedValues.length());
            System.out.println(addedValues);
            addedValues = addedValues.substring(1);
            String measure = addedValues.substring(0, addedValues.indexOf(" "));
            System.out.println(measure);
            switch (measure) {
                case "mm":
                    break;
                case "cm":
                    value = value * 10;
                    break;
                case "dm":
                    value = value * 100;
                    break;
                case "m":
                    value = value * 1000;
                    break;
                case "km":
                    value = value * 1000000;
                    break;
            }
            addedValues = addedValues.substring(addedValues.indexOf(" "), addedValues.length());
            addedValues = addedValues.substring(1);
            if (operator.equals("+"))
                sum += value;
            else sum -= value;
            System.out.println(sum);
        }while (addedValues.length() > 0);
        return sum;
    }
}