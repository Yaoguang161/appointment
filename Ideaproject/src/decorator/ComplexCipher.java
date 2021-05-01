package decorator;



/**
 * Created by Enzo Cotter on 2021/4/30.
 */
public class ComplexCipher extends CipherDecorator implements Cipher {
    public ComplexCipher(Cipher cipher){
        super(cipher);
    }
    public String encrypt(String plainText){
        return reverse(plainText);
    }
    public String reverse(String text) {
        String str="";
        for(int i=text.length();i>0;i--) {
            str+=text.substring(i-1,i);
        }
        return str;
    }
}



