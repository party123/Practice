import java.util.Scanner;

/**
 * Created by 6 on 2017/7/13.
 */
public class xiaohongshu3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = null;
        int[] temp = null;
        int index = 0;
        str= s.nextLine();
        String[] ss = str.split("->");
        for(String tt: ss){
            System.out.println(tt);
            if(tt.equals("NULL")==false){
                temp[index] = Integer.valueOf(tt);
                index ++;
            }
        }
        for(int t = 0 ;t<index;t++)
            System.out.println(temp[t]);
        reorder(temp);
        for(int p = 0; p < temp.length ; p++){
            System.out.print(temp[p]+"->");
        }
        System.out.println("NULL");

    }

    public static void reorder(int[] array){
                 if(array==null||array.length<=0)
                    return;
                 int begin=0;
                 int end=array.length-1;
                 while(begin<end){
                         while(begin<end&&(array[begin]&1)!=0)
                                begin++;
                         while(begin<end&&(array[end]&1)==0)
                                 end--;
                         if(begin<end){
                                 int temp=array[end];
                                 array[end]=array[begin];
                                 array[begin]=temp;
                             }
                     }
             }

         }

