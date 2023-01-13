package information;

import Managers.IdManager;
import customExceptions.AppException;

/*
 * Factory implementation
 * Singleton in nature<<optional>>
 *
 * single point creation of instances for all classes under package
 * returns new instances
 *
 * infoFactory is used in Operation for taking console inputs and returning appropriate instances
 * also used to transmit data between operations & managers
 *
 */

public class InfoFactory {
    private static InfoFactory infoFactory;

    public static InfoFactory getInstance(){
        if (infoFactory == null) {
            infoFactory = new InfoFactory();
        }
        return infoFactory;
    }
    public Bus getBusInstances(int avilability, int busType, String busNo) throws AppException {
        int busId = IdManager.getInstance().getNewId("bus");

        Bus bus = new Bus(busId, avilability, busType, busNo);
        return bus;
    }
    //public User
}
