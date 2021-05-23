package decorator_4;
/**
 * Created by Enzo Cotter on 2021/4/30.
 */
public class Client {
    public static void main(String[] args){

        String plainText="HelloWorld";
        System.out.println("原文档:"+plainText);

        Cipher cipher1=new SimpleCipher();
        System.out.println("------------第一次加密------------------");
        String plainText1=cipher1.encrypt(plainText);
        System.out.println(plainText1);

        ComplexCipher cipher2=new ComplexCipher(cipher1);
        System.out.println("-----------第二次加密----------------------------");
        String plainText2=cipher2.encrypt(plainText1);
        System.out.println(plainText2);

        AdvanceCipher cipher3= new AdvanceCipher(cipher2);
        System.out.println("------------第三次加密--------------------------");
        String plainText3=cipher3.encrypt(plainText2);
        System.out.println(plainText3);
    }
}
