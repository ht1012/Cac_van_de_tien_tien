
package main;


interface lLogging{
    void Log(String message);
}

interface lNotifying {
    void Notify(String message);
}

class FileLogger implements lLogging {
    @Override
    public void Log(String message) {
        System.out.println("Ghi log: " + message);
    }
}

class EmailNotifier implements lNotifying {
    @Override
    public void Notify(String message) {
        System.out.println("Gui thong bao email: " + message);
    }
}

class ServiceManager implements lLogging, lNotifying {
    @Override
    public void Log(String message) {
        System.out.println("Service log: " + message);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Service notify: " + message);
    }
}
public class Man {
    public static void main(String[] args) {

        lLogging FileLogger = new FileLogger();
        FileLogger.Log("Ghi vao Filelogger");

        lNotifying EmailNotifier = new EmailNotifier();
        EmailNotifier.Notify("Thong bao loi");

        ServiceManager service = new ServiceManager();
        service.Log("Dang nhap quan ly dich vu");
        service.Notify("Thay doi trang thai dich vu");
    }
    
}
