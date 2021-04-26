package bridge;

public abstract class OperationSystem {
    protected Player player;

    public Player getPlayer(){
        return player;
    }
    public void setPlayer(Player player){
        this.player = player;
    }
    public abstract void display();
}
