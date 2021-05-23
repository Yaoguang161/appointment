package adapter_1;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
public abstract class EncryptionModule {
    String str;
    int i;

    public void encryption(String str) {
        this.str=str;
    }

    public void key(int i) {
        this.i=i;
    }

    public abstract void caesarCall();
    public abstract void modCall();
    public abstract void show();
}