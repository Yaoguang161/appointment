package priv.text.video;

/**
 * Created by Enzo Cotter on 2020/12/3.
 */
//稀疏数组
public class Demo05 {
    public static void main(String[] args) {
        //创建一个二维数组  11*11 0：没有棋子  1：黑棋 2：白棋
        int[][] array1 =new int[11][11];
        array1[1][2] =1;
        array1[2][3] =2;
        //输入原始的数组
        System.out.println("输出初始的数组");
        for(int[] ints : array1){
            for(int anInt: ints) {
                System.out.printf(anInt+ "\t");
            }
            System.out.println();
        }
        //转化为稀疏数组
        //获取有效值的个数
        
    }
}
