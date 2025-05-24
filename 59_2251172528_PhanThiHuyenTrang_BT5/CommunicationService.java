public class CommunicationService implements ServiceBuilder{
    private SMSService sms = new SMSService();
    @Override
    public void reset(){
        sms = new SMSService();
    }
    
    @Override
    public void buildBilling(){
        sms.setBilling("Goi cuoc SMS");
    }
    
    @Override
    public void buildConnection(){
        sms.setConnection("SMS connection");
    }
    
    @Override
    public void buildSupport(){
        sms.setSupport("24/7 support");
    }
    
    public SMSService getResult(){
        return sms;
    }
}
