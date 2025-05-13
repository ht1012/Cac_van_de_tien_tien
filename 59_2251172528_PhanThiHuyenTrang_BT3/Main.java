/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg59_2251172528_phanthihuyentrang_bt3;
interface ILogging {
    void Log(String message);
}

interface INotifying {
    void Notify(String message);
}

class FileLogger implements ILogging {
    @Override
    public void Log(String message) {
        System.out.println("Ghi log: " + message);
    }
}

class EmailNotifier implements INotifying {
    @Override
    public void Notify(String message) {
        System.out.println("Gui thong bao email: " + message);
    }
}

class SMSNotifier implements INotifying {
    @Override
    public void Notify(String message) {
        System.out.println("Gui thong bao SMS: " + message);
    }
}

abstract class ServiceManager{
    public abstract ILogging createLogger();
    public abstract INotifying createNotifier();
}

class FileEmailServiceManager extends ServiceManager{

    @Override
    public ILogging createLogger(){
        return new FileLogger();
    }
    
    @Override
    public INotifying createNotifier(){
        return new EmailNotifier();
    }
}

class FileSMSServiceManager extends ServiceManager{

    @Override
    public ILogging createLogger(){
        return new FileLogger();
    }
    
    @Override
    public INotifying createNotifier(){
        return new SMSNotifier();
    }
}
public class Main {

    public static void main(String[] args) {
        ServiceManager email = new  FileEmailServiceManager();
        ILogging log = email.createLogger();
        INotifying not = email.createNotifier();
        
        log.Log("Email da duoc khoi tao");
        not.Notify("Chao mung toi email");
        
        System.out.println("--------------------");
        
        ServiceManager SMS = new  FileSMSServiceManager();
        ILogging log2 = SMS.createLogger();
        INotifying not2 = SMS.createNotifier();
        
        log2.Log("SMS da duoc khoi tao");
        not2.Notify("Chao mung toi sms");
        
    }
    
}
