package proxy_6;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject;
        subject = new Proxy();
        subject.method();
    }
}

