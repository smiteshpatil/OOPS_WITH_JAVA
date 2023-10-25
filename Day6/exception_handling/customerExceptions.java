package exception_handling;

import src.Customer;

public class customerExceptions extends Exception {

    public customerExceptions(String error_msg) {
        super(error_msg);
    }
}
