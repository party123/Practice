/**
 * Created by 6 on 2017/5/8.
 */
public class Wildcard_Matching {
    public boolean isMatch(String s, String p) {
        boolean ans = false;
        if(s == null && p == null || s == null&& p == "*") return true;
        StringBuilder st = new StringBuilder();
        String[] a;
        a = p.split("\\*");
        for(int i = 0 ; i < a.length ; i ++ ){
            st.append(a[i]);
        }
        int len1 = s.length();
        int len2 = p.length();
        int index = 0;
        for(int i = 0; i<len1; i++){
            if(p.charAt(index)!='?'&&p.charAt(index)!='*'&&s.charAt(i)!=p.charAt(index)) break;
            if(p.charAt(index) == '?' ||s.charAt(i) == p.charAt(index)) index++;
            if(p.charAt(index)== '*'){
                if(p.indexOf('*',index) == p.lastIndexOf('*',index)){

                }
            }

        }
        return ans;
    }
    public static void main(String args[]){

    }
}
