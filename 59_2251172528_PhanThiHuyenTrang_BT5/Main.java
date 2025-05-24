public class Main {

    public static void main(String[] args) {
        InternetService b = new InternetService();
        ServiceDirector d = new ServiceDirector(b);
        d.make("internet");
        FPTService inter = b.getResult();
        System.out.println(inter);
        
        CommunicationService c = new CommunicationService();
        d.changeServiceBuilder(c);
        d.make("sms");
        SMSService i = c.getResult();
        System.out.println(i);
    }
    
}
