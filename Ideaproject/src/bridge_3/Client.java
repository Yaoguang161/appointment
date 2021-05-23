package bridge_3;

public class Client {
    public static void main(String[] args){
        Player player;
        OperationSystem OS;
        player = (Player)XMLUtil.getBean("Player");
        OS = (OperationSystem)XMLUtil.getBean("OS");
        OS.setPlayer(player);

        OS.display();
    }
}
