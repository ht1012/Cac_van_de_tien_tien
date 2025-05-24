public class InternetService implements ServiceBuilder {
    private  FPTService fpt = new FPTService();
    @Override
    public void reset(){
        fpt = new FPTService();
    }
    
    @Override
    public void buildBilling(){
        fpt.setBilling("Goi cuoc FPT");
    }
   
    @Override
    public void buildConnection(){
        fpt.setConnection("FPT connection");
    }
    
    @Override
    public void buildSupport(){
        fpt.setSupport("24/7 support");
    }
    
    public FPTService getResult(){
        return fpt;
    }
}
