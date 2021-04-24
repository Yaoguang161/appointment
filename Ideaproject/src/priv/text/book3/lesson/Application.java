package priv.text.book3.lesson;

/**
 * Created by Enzo Cotter on 2020/12/27.
 */
public class Application {
    public static void main(String args[]){
        MobileTelephone telephone = new MobileTelephone();
        SIM sim = new SIMOfChinaMobile();
        sim.setNumber("13887656432");
        telephone.useSIM(sim);
        telephone.showMess();
        sim = new SIMOfChinaUnicom();
        sim.setNumber("13097656437");
        telephone.useSIM(sim);
        telephone.showMess();
    }

}
