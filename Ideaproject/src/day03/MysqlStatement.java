package day03;

class MySqlStatement implements Statement {
    @Override
    public void execute() {
        System.out.println("执行MySql数据库操作语句");
    }
}
