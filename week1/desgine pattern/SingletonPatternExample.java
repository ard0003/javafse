public class SingletonPatternExample{

    static class Logger {
        private static Logger instance = new Logger(); // Eager initialization

        // Private constructor to prevent instantiation
        private Logger() {
            System.out.println("Logger instance created.");
        }

        // Public method to provide global access to the instance
        public static Logger getInstance() {
            return instance;
        }

        // Method to simulate logging
        public void log(String message) {
            System.out.println("[LOG] " + message);
        }
    }

    // Main method to test Singleton
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verify Singleton behavior
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances detected! Singleton failed.");
        }
    }
}
