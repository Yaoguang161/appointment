package proxy_6;

/**
 * Created by Enzo Cotter on 2021/5/23.
 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class Proxy extends Subject {
    private RealSubject realSubject ;
    public void before(){
        Date now = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd ',' hh:mm:ss");
        System.out.println("方法method()被调用，调用时间为："+ft.format(now));
    }
    @Override
    public void method() {
        realSubject = new RealSubject();
        before();
        try {
            realSubject.method();
            after();
        }catch (NullPointerException e){
            System.out.println("方法method()调用失败");
        }
    }
    public void after(){
        System.out.println("方法method()调用成功");
    }
}
