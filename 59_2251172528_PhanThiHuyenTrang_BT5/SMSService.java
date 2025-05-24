public class SMSService {
    String Billing;
    String Connection;
    String Support;
    
    public void setBilling(String Billing){
        this.Billing = Billing;
    }
    
    public void setConnection(String Connection){
        this.Connection = Connection;
    }
    
    public void setSupport(String Support){
        this.Support = Support;
    }
    @Override
    public String toString(){
        return "SMSService: " + "Billing = " + Billing+" Connection = " + Connection + " Support = " +Support;
    }
}
