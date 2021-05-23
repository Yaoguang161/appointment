package adapter_1;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
public class Client {
    public static void main(String[] args) {
        EncryptionModule en=new Adapter();
        en.show();
    }
}