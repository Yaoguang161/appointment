package waiguan_2;

public class Client {
    public static void main(String[] args) {
        AbstractFacade af;
        af = new xmlProcessFacade();
        af = new DataProcessFacade();
        af.dataProcess();
    }
}
