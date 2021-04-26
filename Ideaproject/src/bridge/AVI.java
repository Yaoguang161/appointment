package bridge;

public class AVI implements Player {
    @Override
    public void parsePlayer(String osType) {

        System.out.println("格式为AVI的图像"+"在"+osType+"平台中解析显示。");
    }
}
