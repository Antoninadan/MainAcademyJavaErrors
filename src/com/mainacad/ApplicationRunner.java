package com.mainacad;

import com.mainacad.service.NumberService;

import java.util.logging.Logger;

public class ApplicationRunner {


    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        String text = null;
//        LOGGER.info("Lenth of " + text.length());

        LOGGER.info("Result is " + NumberService.getDivResult(12, 0));

        try {
            LOGGER.info("Result is " +NumberService.getDivResultThrows(12, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }

        LOGGER.info("Work");

    }
}
