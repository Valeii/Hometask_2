/**
 * Created by Администратор on 04.10.2015.
 */

import java.util.regex.Pattern;

public class Primitive_Data_Types {
    double value;


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    public void CalculateSumOfNubmers() {
        int sum;
        String str = Double.toString(value);
        String[] strParse = Pattern.compile(".").split(str, 2);
        System.out.println("Часть числа до запятой" + strParse[0]);
        System.out.println("Часть числа после запятой" + strParse[1]);
        Character a1 = strParse[0].charAt(0);
        Character a2 = strParse[0].charAt(1);
        Character a3 = strParse[0].charAt(2);
        Character a4 = strParse[1].charAt(0);
        Character a5 = strParse[1].charAt(1);
        int b1 = Character.getNumericValue(a1);
        int b2 = Character.getNumericValue(a2);
        int b3 = Character.getNumericValue(a3);
        int b4 = Character.getNumericValue(a4);
        int b5 = Character.getNumericValue(a5);
        sum = b1 + b2 + b3 + b4 + b5;
        System.out.println("Сумма цифр числа" + sum);


    }

    public void CalculateSumOfNubmers_1() {
        int sum;
        String str = Double.toString(value);
        String str1;
        String str2;
        str1 = str.substring(3);
        str2 = str.substring(0, 3);
        Integer a1 = Integer.valueOf(str1);
        Integer a2 = Integer.valueOf(str2);
        int firstNumber = a1 / 100;
        int secondNumber = a1 % 100;
        int thirdNumber = a1 / 10;
        int intermidiateValue = a1 / 10;
        //a1/100 = firstNumber;
        // a1%100 = thirdNumber;
        // a1/10 = intermidiateValue;
        secondNumber = intermidiateValue % 10;
        int firstNumber_1;
        int secondNumber_1;
        firstNumber_1 = a2 / 10;
        secondNumber_1 = a2 % 10;
        sum = firstNumber + secondNumber + thirdNumber + firstNumber_1 + secondNumber_1;
        System.out.println("Сумма цифр числа" + sum);


    }

    public void Determination_MAX() {
        int MAX;
        String str = Double.toString(value);
        String str1;
        String str2;
        str1 = str.substring(3);
        str2 = str.substring(0, 3);
        Integer a1 = Integer.valueOf(str1);
        Integer a2 = Integer.valueOf(str2);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int intermidiateValue;
        firstNumber = a1 / 100;
        thirdNumber = a1 % 100;
        intermidiateValue = a1 / 10;
        secondNumber = intermidiateValue % 10;
        int firstNumber_1;
        int secondNumber_1;
        firstNumber_1 = a2 / 10;
        secondNumber_1 = a2 % 10;
        int max1 = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        int max2 = Math.max(firstNumber_1, secondNumber_1);
        System.out.println("Максимальное чисто" + Math.max(max2, max1));


    }

    public void Determination_MIN() {
        int MIN;
        String str = Double.toString(value);
        String str1;
        String str2;
        str1 = str.substring(3);
        str2 = str.substring(0, 3);
        Integer a1 = Integer.valueOf(str1);
        Integer a2 = Integer.valueOf(str2);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int intermidiateValue;
        firstNumber = a1 / 100;
        thirdNumber = a1 % 100;
        intermidiateValue = a1 / 10;
        secondNumber = intermidiateValue % 10;
        int firstNumber_1;
        int secondNumber_1;
        firstNumber_1 = a2 / 10;
        secondNumber_1 = a2 % 10;
        int min1 = Math.min(firstNumber, Math.max(secondNumber, thirdNumber));
        int min2 = Math.min(firstNumber_1, secondNumber_1);
        System.out.println("Минимальное чисто" + Math.min(min1, min2));


    }


}
