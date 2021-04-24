package priv.text;

/**
 * Created by Enzo Cotter on 2021/1/21.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.sound.midi.Soundbank;
class Benz implements Car{
    @Override
    public void play() {
        System.out.println("奔驰汽车生产中。。。。");
    }
}
class BMW implements Car{
    @Override
    public void play() {
        System.out.println("宝马汽车生产中。。。");
    }
}
interface Car {
    public void play();
}

class CarFactory {
    public static Car produceCar(String brand){
        Car car=null;
        System.out.println("使用简单工厂模式");
        if(brand.equalsIgnoreCase("BMW")){
            System.out.println("BMW汽车工厂正在生产BMW汽车");
            return new BMW();
        }else if(brand.equalsIgnoreCase("Benz")){
            System.out.println("Benz汽车生产Benz汽车");
            return new Benz();
        }else {
            System.out.println("展示不能生产该品牌汽车");;
        }
        return car;
    }
}
class Client2 {
    public static void main(String args[]){
        Car car=null;
        String brand = getBrand();
        try{
            car=CarFactory.produceCar(brand);
        }catch (Exception e){
            e.printStackTrace();
        }
        car.play();
    }
    public  static String getBrand(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输出汽车的品牌：");
            String str=strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}


