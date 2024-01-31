package by.tms;

import by.tms.console.ConsoleApplication;
import by.tms.web.WebApplication;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Application application = new WebApplication();
        application.run();
    }
}
