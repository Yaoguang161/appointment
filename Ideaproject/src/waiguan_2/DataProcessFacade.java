package waiguan_2;

public class DataProcessFacade extends AbstractFacade {
    private FileReader fileReader;
    private FileConversion fileConversion;
    private DataShow dataShow;

    @Override
    public void dataProcess() {
        System.out.println("处理非XML格式的数据");
        fileConversion = new FileConversion();
        fileReader = new FileReader();
        dataShow = new DataShow();
        fileReader.read();
        fileConversion.conver();
        dataShow.show();
    }

}
