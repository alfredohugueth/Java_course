package aritmetic;

import exceptions.OperationException;

public class Aritmetic {
    public static int division(int numerator, int denominator) throws OperationException{
        if ( denominator == 0 )
            throw new OperationException("Division entre 0");

        return numerator / denominator;
    }
}
