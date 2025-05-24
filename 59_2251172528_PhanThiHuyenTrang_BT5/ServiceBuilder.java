public interface ServiceBuilder {
    void reset();
    void buildBilling();
    void buildConnection();
    void buildSupport();
    Object  getResult();
}
