package decorator;

/**
 * Created by Enzo Cotter on 2021/4/30.
 */
public class AdvanceCipher extends CipherDecorator{

    public AdvanceCipher(Cipher cipher) {
        super(cipher);
    }
    public String encrypt(String plainText){
        return  mod(plainText);
    }

    public String mod(String plainText){
        String str = "";
        for(int i = 0; i <plainText.length(); i++){
            String c = String.valueOf(plainText.charAt(i)%6);
            str += c;
        }
        return str;
    }


}
