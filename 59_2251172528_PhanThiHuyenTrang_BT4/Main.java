public class Main {

 
    abstract static class ContactService {
        protected String msg;
        public abstract void sendMessage(String msg);
    }

    abstract static class InternetService {
        protected String msg;
        public abstract void sendMessage(String msg);
    }


    static class EmailService extends ContactService {
        @Override
        public void sendMessage(String msg) {
            System.out.println("Gui dich vu Email: " + msg);
        }
    }

    static class SMSService extends ContactService {
        @Override
        public void sendMessage(String msg) {
            System.out.println("Gửi dịch vụ SMS: " + msg);
        }
    }

    static class FPTService extends InternetService {
        @Override
        public void sendMessage(String msg) {
            System.out.println("Gui dich vu FPT: " + msg);
        }
    }

    static class ViettelService extends InternetService {
        @Override
        public void sendMessage(String msg) {
            System.out.println("Gui dich vu Viettel: " + msg);
        }
    }

    interface ServiceFactory {
        ContactService createContactService();
        InternetService createInternetService();
    }

    static class ModernServiceFactory implements ServiceFactory {
        @Override
        public ContactService createContactService() {
            return new EmailService();
        }

        @Override
        public InternetService createInternetService() {
            return new FPTService();
        }
    }

    static class TraditionalServiceFactory implements ServiceFactory {
        @Override
        public ContactService createContactService() {
            return new SMSService();
        }

        @Override
        public InternetService createInternetService() {
            return new ViettelService();
        }
    }

    public static void main(String[] args) {

        ServiceFactory fa1 = new ModernServiceFactory();
        ContactService contact1 = fa1.createContactService();
        InternetService internet1 = fa1.createInternetService();

        contact1.sendMessage("Xin chao qua Email");
        internet1.sendMessage("xin chao qua FPT");


        ServiceFactory fa2 = new TraditionalServiceFactory();
        ContactService contact2 = fa2.createContactService();
        InternetService internet2 = fa2.createInternetService();

        contact2.sendMessage("Xin chao qua SMS");
        internet2.sendMessage("Xin chao qua Viettel");
    }
}
