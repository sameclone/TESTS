package OCJP8.chap7;

/**
 * Created by yevgeniya.zuyeva on 09.02.2017.
 */
public class Tests10 {
    private Tests10() {
        super();
    }

    private static Tests10 instance;

    public static synchronized Tests10 getInstance() {
        if (instance == null)
            instance = new Tests10();
        return instance;
    }

    private int tickers;

    public int getTickerCounts() {
        return tickers;
    }

    public void makeTickersAvailable(int value) {
        tickers += value;
    }

    public void sellTickers(int value) {
        synchronized (this) {
            tickers -= value;
        }
    }

}
