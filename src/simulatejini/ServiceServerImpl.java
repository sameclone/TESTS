package simulatejini;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

/**
 * Created by yevgeniya.zuyeva on 27.12.2016.
 */
public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {

    HashMap<String, Service> serviceList;

    protected ServiceServerImpl() throws RemoteException {
        setUpServices();
    }

    private void setUpServices() {
        serviceList = new HashMap();
        serviceList.put("Dice Rolling service", new DiceService());
        serviceList.put("Day of the week service", new DayOfTheWeekService());
        serviceList.put("Visual music service", new MiniMusicService());
    }

    @Override
    public Object[] getServiceList() throws RemoteException {
        System.out.println("in remote");
        return serviceList.keySet().toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        Service theService = serviceList.get(serviceKey);
        return theService;
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("ServiceServer", new ServiceServerImpl());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Remote service is running");
    }
}
