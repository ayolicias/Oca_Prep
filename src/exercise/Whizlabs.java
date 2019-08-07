package exercise;

import java.sql.SQLOutput;

import static javafx.scene.input.KeyCode.X;

public class Whizlabs {

    public static void main( String[] args ) {

        try {

            int whizData[] = new int[10];
            System.out.println("Accessing element eleven:" + whizData[11]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oops...Idefed exeption :: "+ e);
        }

        try {
            Double number = Double.valueOf("120D");

        }
        catch (NumberFormatException ex){
            System.out.println(ex);
        }
//        System.out.println(number);

        int sum = 0;

        for (int X = 0;X<=10;X++)

        sum += X;

        System.out.print("sum for 0 to " + X);
        System.out.println(" = " + sum);

    }
}
