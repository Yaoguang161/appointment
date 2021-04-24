package day03;

public class OrcalConnection implements Connection {
    @Override
    public void where() {
        System.out.println("连接到Orcal...");
    }
}