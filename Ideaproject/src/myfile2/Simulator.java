package myfile2;

/**
 * Created by Enzo Cotter on 2020/12/14.
 */
public class Simulator {
    public void playSound(Animal animal){
        System.out.println("这是"+animal.getAnimalName()+"的叫声");
        animal.shot();
    }
}
