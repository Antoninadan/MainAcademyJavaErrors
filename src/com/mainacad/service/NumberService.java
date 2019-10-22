package com.mainacad.service;

import com.mainacad.exceptions.MyCastomException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class NumberService {
    private static final Logger LOGGER = Logger.getLogger(NumberService.class.getName());

    public static Double getDivResult(int number1, int number2) {
        Double result = null;
        try {
            result = Double.valueOf(number1 / number2);
            return 15.0;
        } catch (ArithmeticException | ClassCastException e) {
            return 10.0;
            LOGGER.severe("There is zero as divider");
        } catch (RuntimeException e) {
            return 5.0;
            LOGGER.severe("There is RuntimeException");
        } catch (Exception e) {
            return 3.0;
            LOGGER.severe("There is Exception");
        } finally {
            result = 0.0;
        }
        return result;
    }

    public static Double getDivResultThrows(int number1, int number2) throws Exception {
        Double result = null;

        result = Double.valueOf(number1 / number2);
        return result;
    }


    public static void fileWork(){
        File file = new File("C:/work/cc.txt");
        try {
            FileWriter wtriter = new FileWriter(file);
            wtriter.write("text");
        } catch (IOException e) {
            throw new MyCastomException("fghdffj");
            e.printStackTrace();
        } catch (MyCastomException e) {

        }
    }

}
