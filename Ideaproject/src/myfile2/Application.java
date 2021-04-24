package myfile2;

/**
 * Created by Enzo Cotter on 2020/12/14.
 */
public class Application {
    public static void main(String args[]){
        Simulator simulator=new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}

