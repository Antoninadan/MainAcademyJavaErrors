package com.mainacad;

import com.mainacad.service.NumberService;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ApplicationRunner {


    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

//        // call NullPointerException
//        String text = null;
//        LOGGER.info("Lenth of " + text.length());

//        // test /0
//        LOGGER.info("Result is " + NumberService.getDivResult(12, 0));

        // test
        try {
            LOGGER.info("Result is " +NumberService.getDivResultThrows(12, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        LOGGER.info("Work");


//        // Test getAreaValue
//        int result = 0;
//
//        try {
//            result = getAreaValue(-1, 100);
//        } catch (IllegalArgumentException e) {
//            LOGGER.info("В метод вычисления площади был передан аргумент с негативным значением!");
//            throw e;
//        }
//        System.out.println("Result is : " + result);

//        // test finally
//        try {
//            procA();
//        } catch (Exception e) {
//        }
//        procB();

        //
//        System.out.println(getDivResult(3,0));

//        // test ArrayIndexOutOfBoundsException
//        int[] mas = {1, 2, 3};
//        try {
//            for (int i=0; i<=mas.length; i++){
//                LOGGER.info(Integer.toString(mas[i]));
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            LOGGER.severe("out of range");
//        }

    }


    public static Double getDivResult(int number1, int number2) {
        Double result = null;
        try {
            result = Double.valueOf(number1 / number2);
            return 15.0;
        } catch (ArithmeticException | ClassCastException e) {
            LOGGER.severe("There is zero as divider");
//            return 10.0;
        } finally {
//            return 0.0;
            throw new NullPointerException();
        }
//        return result;
    }

    public static int getAreaValue(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x=" + x + ", y=" + y);
        return x * y;
    }

    public static void procA() {
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }

    public static void procB() {
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }
}
