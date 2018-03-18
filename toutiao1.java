/**
 * Created by 6 on 2017/8/22.
 */
import com.sun.corba.se.impl.orbutil.ObjectStreamClass_1_3_1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class toutiao1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<ArrayList<Integer>> lists = new LinkedList<>();
        LinkedList<ArrayList<Integer>> copy = new LinkedList<>();
        while(sc.hasNextInt()){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int P = sc.nextInt();
            for(int i = 0; i < P; i++){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(sc.nextInt());
                list.add(sc.nextInt());
                list.add(sc.nextInt());
                list.add(sc.nextInt());
                lists.add(list);
                copy.add(list);
            }
            Collections.sort(lists, new Comparator<ArrayList<Integer>>(){
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    int startTime1 = o1.get(1);
                    int startTime2 = o2.get(1);
                    return startTime1 - startTime2;
                }
            });
            int MInSpace = M;       //空闲的程序员
            LinkedList<ArrayList<Integer>> delayLists = new LinkedList<>();     //延迟等待队列
            Map<ArrayList<Integer>, Integer> map = new HashMap<>();             //结果集
            ArrayList<Integer> pFinishTime = new ArrayList<>();     //结束时间
            int time = 1;
            while(lists.size() > 0 || delayLists.size() > 0){
                for(int i = 0; i < lists.size(); i++){
                    if(lists.get(i).get(1) <= time) delayLists.add(lists.get(i));
                    else break;
                }
                Iterator<Integer> it = pFinishTime.iterator();
                while(it.hasNext()){
                    int tmp = it.next();
                    if(tmp + 1 == time){
                        it.remove();
                        MInSpace++;
                    }
                }
                Collections.sort(delayLists, new Comparator<ArrayList<Integer>>() {
                    @Override
                    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                        int pID1 = o1.get(0);
                        int pID2 = o2.get(0);
                        int startTime1 = o1.get(1);
                        int startTime2 = o2.get(1);
                        int priority1 = o1.get(2);
                        int priority2 = o2.get(2);
                        int needTime1 = o1.get(3);
                        int needTime2 = o2.get(3);
                        if(priority1 != priority2){
                            return priority1 - priority2;
                        }else{

                        }
                        return 0;
                    }
                });

            }
        }
    }
}
