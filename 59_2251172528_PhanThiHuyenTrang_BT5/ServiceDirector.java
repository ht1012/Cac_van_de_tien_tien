public class ServiceDirector {
    private ServiceBuilder buil;
    public ServiceDirector(ServiceBuilder build){
        buil = build;
    }
    
    public void changeServiceBuilder (ServiceBuilder build){
        buil = build;
    }
    
    public void make(String type){
        buil.reset();
        buil.buildBilling();
        buil.buildConnection();
        buil.buildSupport();
    }
}
