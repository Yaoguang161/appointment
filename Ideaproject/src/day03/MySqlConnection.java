package day03;

public class MySqlConnection implements Connection {
    @Override
    public void where() {
        System.out.println("连接到MySql...");
    }
}