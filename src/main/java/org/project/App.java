package org.project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        logger.info("This is an info message.");
        logger.error("This is an error message.");
        logger.debug("This is a debug message.");
    }
}
