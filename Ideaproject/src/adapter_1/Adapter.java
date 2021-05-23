package adapter_1;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
import java.util.Scanner;
public class Adapter extends EncryptionModule{
    private Caesar caesar;
    private Mod mod;
    public Adapter() {
        caesar=new Caesar();
        mod=new Mod();
    }

    public void caesarCall() {
        System.out.println("调用凯撒加密");
        String s1=caesar.doCaesarEncrypt(i, str);
        System.out.println("凯撒加密的结果为："+s1);
    }

    public void modCall() {
        System.out.println("调用取模加密");
        String s2=mod.doModEncrypt(i, str);
        System.out.println("取模加密的结果为："+s2);
    }

    public void show() {
        EncryptionModule en=new Adapter();

        System.out.println("---加密方式有凯撒加密和取模加密---");

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要加密的明文：");
        String str1=sc.nextLine();
        en.encryption(str1);

        System.out.println("请输入要选择的加密方式：");
        String str2=sc.nextLine();

        if(str2.equalsIgnoreCase("凯撒加密")) {
            System.out.println("请输入密钥：");
            int i=sc.nextInt();
            en.key(i);
            en.caesarCall();
        }
        if(str2.equalsIgnoreCase("取模加密")) {
            System.out.println("请输入密钥：");
            int i=sc.nextInt();
            en.key(i);
            en.modCall();
        }

        sc.close();
    }
}