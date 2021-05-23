package adapter_1;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
public class Caesar {
    //凯撒加密
    public String doCaesarEncrypt(int key,String ps) {
        String es="";
        for(int i=0;i<ps.length();i++) {
            char c=ps.charAt(i);
            if(c>='a' && c<='z') {
                c+=key%26;
                if(c>'z')
                    c-=26;
                if(c<'a')
                    c+=26;
            }
            if(c>='A' && c<='Z') {
                c+=key%26;
                if(c>'Z')
                    c-=26;
                if(c<'A')
                    c+=26;
            }
            es+=c;
        }
        return es;
    }
}