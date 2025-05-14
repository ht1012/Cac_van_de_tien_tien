
package pkg59_2251172528_phanthihuyentrang_bt3;

import java.util.Scanner;

    interface Service {
        void doStuff();
    }


    class DeliveryService implements Service {
        @Override
        public void doStuff() {
            System.out.println("Dang thuc hien dich vu giao hang.");
        }
    }

    class LaundryService implements Service {
        @Override
        public void doStuff() {
            System.out.println("Dang thuc hien dich vu giat ui.");
        }
    }

    abstract class ServiceManager {
        public void someOperation() {
            Service service = createService(); 
            service.doStuff();                 
        }
        public abstract Service createService();
    }

    class DeliveryServiceManager extends ServiceManager {
        @Override
        public Service createService() {
            return new DeliveryService();
        }
    }

    class LaundryServiceManager extends ServiceManager {
        @Override
        public Service createService() {
            return new LaundryService();
        }
    }
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("HE THONG QUAN LY DICH VU");
        System.out.println("1. Dich vu giao hang");
        System.out.println("2. Dich vu giat ui");
        System.out.print("Chon dich vu (1-2): ");
        int choice = scanner.nextInt();

        ServiceManager manager;

        switch (choice) {
            case 1:
                manager = new DeliveryServiceManager();
                break;
            case 2:
                manager = new LaundryServiceManager();
                break;
            default:
                System.out.println("Lua chon dich vu.");
                return;
        }

        manager.someOperation();
        
    }
    
}
