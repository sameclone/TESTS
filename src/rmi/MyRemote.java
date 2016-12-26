package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by yevgeniya.zuyeva on 26.12.2016.
 */
public interface MyRemote extends Remote{

    public String sayHello() throws RemoteException;
}
