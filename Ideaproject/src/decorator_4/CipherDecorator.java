package decorator_4;



/**
 * Created by Enzo Cotter on 2021/4/30.
 */
public class CipherDecorator {
    Cipher cipher;
    public CipherDecorator(Cipher cipher)
    {

        this.cipher=cipher;
    }
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }

}
