/**
 * Created by 6 on 2018/3/11.
 */
public class offer_4 {
    public String replaceSpace(StringBuffer str) {
        int sum = 0;
        StringBuffer s = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                s.append(str.charAt(i));
            } else {
                s.append("02%");
            }
        }
        return s.reverse().toString();
    }
}
