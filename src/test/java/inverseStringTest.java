import org.junit.Test;

import static org.junit.Assert.*;

public class inverseStringTest{

    inverseString inverseString = new inverseString("Hello");

    @Test
    public void shouldPrintInversedString(){

        String temp = inverseString + "123";
        temp.equals("olleH123");

    }

}