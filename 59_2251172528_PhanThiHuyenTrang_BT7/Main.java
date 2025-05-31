public class Main {

    interface InternetConnection{
        void connect(String type);
    }
    
    static class WifiConnection implements InternetConnection {
        @Override
        public void connect(String type) {
            System.out.println("Connecting via WiFi: " + type);
        }
    }
    
    static class MobileConnection implements InternetConnection {
        @Override
        public void connect(String type) {
            System.out.println("Connecting via Mobile Data: " + type);
        }
    }
    
    static abstract class ServiceManager {
        protected InternetConnection connection;

        public void openConnection() {
            connection = createConnection();
            connection.connect("default");
        }
        protected abstract InternetConnection createConnection();
    }
    
    static class SecureServiceManager extends ServiceManager {

        @Override
        protected InternetConnection createConnection() {
            return new WifiConnection();
        }

        public void openSecureConnection() {
            connection = createConnection();
            connection.connect("secure");
        }
    }

    public static void main(String[] args) {
        ServiceManager manager = new SecureServiceManager();

        manager.openConnection();
        ((SecureServiceManager) manager).openSecureConnection(); 
    }
    
}
