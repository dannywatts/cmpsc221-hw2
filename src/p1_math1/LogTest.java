package p1_math1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogTest {
    static void main() {
        Logger logger = Logger.getLogger(LogTest.class.getName());
        logger.log(Level.FINE, "Hello, world!");
    }
}
