import java.util.*;

/**
 * Created by jack on 2017/7/6.
 */
public class huawei2017_3 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
        int n = cin.nextInt();
        cin.nextLine();

        for(int i = 0; i < n; i++){
            String curLine = cin.nextLine();
            String[] temp = curLine.split(" ");
            String s1 = temp[0];
            String s2 = temp[1];
            if(map.containsKey(s1)){
                HashSet<String> set = map.get(s1);
                if(!set.contains(s2)){
                    set.add(s2);
                }
            }
            else{
                HashSet<String> set = new HashSet<>();
                set.add(s2);
                map.put(s1, set);
            }
        }
        String cl = cin.nextLine();
        String[] temp = cl.split(" ");
        String s1 = temp[0];
        String s2 = temp[1];
        if(check(s1, s2, map, 0) && check(s2, s1, map, 0)){
            System.out.println("T");
        }
        else{
            System.out.println("F");
        }
    }
    public static boolean check(String a, String b, HashMap<String, HashSet<String>> map, int steps){
        steps++;
        if(steps > map.size() + 10){
            return false;
        }
        if(!map.containsKey(a) || !map.containsKey(b)){
            return false;
        }
        HashSet<String> set = map.get(a);
        if(set.contains(b)){
            return true;
        }
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String curVal = it.next();
            if(check(curVal, b, map, steps)){
                return true;
            }
        }
        return false;
    }
}
