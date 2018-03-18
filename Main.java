import java.lang.reflect.Array;
import java.util.Scanner;
public class Main {
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    private static final int CUSTOMS_LIMIT_MONEY_PER_BOX = 2000;

    static class BoxTemplate{
        int length;
        int width;
        int height;
        int price;
    }

    static class Model{
        int length;
        int width;
        int height;
        int price;
    }

    static BoxTemplate boxTemplate = new BoxTemplate();
    static Model[] items = null;
    static int boxMinNum;

    private static int process()
    {
        int boxNums = 1;
        int remainingLength = boxTemplate.length;
        int remainingWidth = boxTemplate.width;
        int remainingHeight = boxTemplate.height;
        for(Model model : items){
            if(model.price > 2000 || model.length > boxTemplate.length || model.height > boxTemplate.height || model.width > boxTemplate.width){
                return -1;
            }

            //如果横放、竖放跟侧放中的一个可以，就boxNums+1;
            if(model.length < remainingLength && model.width < remainingWidth && model.height < remainingHeight ){
                //横放
                remainingLength -= model.length;
                remainingWidth -= model.width;
                remainingHeight -= model.height;
            }else if(model.length < remainingWidth && model.width < remainingWidth && model.height < remainingHeight){
                //竖放
                remainingLength -= model.width;
                remainingWidth -= model.length;
                remainingHeight -= model.height;
            }else if(model.length < remainingHeight && model.width < remainingWidth && model.height < remainingHeight){
                //侧放
                remainingLength -= model.height;
                remainingWidth -= model.width;
                remainingHeight -= model.length;
            }else{
                boxNums++;
                remainingLength = boxTemplate.length;
                remainingWidth = boxTemplate.width;
                remainingHeight = boxTemplate.height;
            }
        }
        return boxNums;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in



        );
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;

        while (scanner.hasNext()){
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            items = new Model[itemNum];
            for(int i=0; i<itemNum; i++){
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            boxMinNum = Integer.MAX_VALUE;
            System.out.println (process());

        }
    }

}
