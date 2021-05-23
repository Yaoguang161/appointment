package waiguan_2;



class xmlProcessFacade extends AbstractFacade {
    private FileReader fileReader;

    private DataShow dataShow;


    @Override

    public void dataProcess() {
        System.out.println("开始处理xml格式的数据");

        dataShow = new DataShow();

        fileReader.read();

        dataShow.show();

    }

}
