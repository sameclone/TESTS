package OCJP8.chap6;

import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

/**
 * Created by yevgeniya.zuyeva on 31.01.2017.
 */
public class TestsRethrowingExceptions {

    public void parseData() throws SQLException, DateTimeParseException {
    }

    public void multicatch() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (SQLException | DateTimeParseException e) {
            System.err.println(e);
            throw e;
        }
    }

    public void rethrowing() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }

    public void parseData1() throws SQLException, DateTimeParseException, IOException {
    }


    public void multicatch1() throws SQLException, DateTimeParseException, IOException {
        try {
            parseData1();
        } catch (SQLException | DateTimeParseException | IOException e) {
            System.err.println(e);
            throw e;
        }
    }

    public void rethrowing1() throws SQLException, DateTimeParseException, IOException {
        try {
            parseData1();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }


    public void parseData2() throws DateTimeParseException, IOException {
    }


    public void multicatch2() throws DateTimeParseException, IOException {
        try {
            parseData2();
        } catch (DateTimeParseException | IOException e) {
            System.err.println(e);
            throw e;
        }
    }

    public void rethrowing2() throws SQLException, DateTimeParseException, IOException {
        try {
            parseData2();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }
}

