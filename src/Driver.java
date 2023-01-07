import operations.AppDriver;

/*
* the entry point for application
* starts by calling initiate function of AppDriver
*/

public class Driver {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        AppDriver appDriver = new AppDriver();
        appDriver.initiate();
    }
}