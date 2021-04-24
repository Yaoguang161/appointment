package priv.text.book;

/**
 * Created by Enzo Cotter on 2020/11/2.
 */
public class Land {
    public static void main(String []args){
        Village.setWaterAmount(200);
        int leftWater = Village.waterAmount;
        System.out.println("水井中有"+leftWater+"升水");
        Village zhaozhuang,majiahezhi;
        zhaozhuang=new Village("赵庄");
        majiahezhi=new Village("马家河子");
        zhaozhuang.setPeopleNumber(80);
        majiahezhi.setPeopleNumber(120);
        zhaozhuang.drinkWater(50);
        leftWater=majiahezhi.lookWaterAmount();
        String name=majiahezhi.name;
        majiahezhi.drinkWater(100);
        leftWater=zhaozhuang.lookWaterAmount();
        name=zhaozhuang.name;
        System.out.println(name+"发现水井中有"+leftWater+"升水");
        int peopleNumber=zhaozhuang.getPeopleNumber();
        System.out.println("赵庄的人口"+peopleNumber);
        System.out.println("马家河子的人口"+peopleNumber);
    }
}