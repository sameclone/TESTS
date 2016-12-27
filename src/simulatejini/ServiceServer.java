package simulatejini;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by yevgeniya.zuyeva on 27.12.2016.
 */
public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;
    Service getService(Object serviceKey) throws RemoteException;
}
