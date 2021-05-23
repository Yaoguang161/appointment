package adapter_1;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
public class Mod {
    //取模加密
    public String doModEncrypt(int key,String ps) {
        String es="";
        for(int i=0;i<ps.length();i++) {
            String c=String.valueOf(ps.charAt(i)%key);
            es+=c;
        }
        return es;
    }
}