/**
 * Created by 6 on 2018/3/7.
 */
public class Leetcode_345_Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {
        String yuanyin = "aeiouAEIOU";
        char[] set = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            while(!yuanyin.contains(s.charAt(start)+""))
                start++;
            while(!yuanyin.contains(s.charAt(end)+""))
                end--;
            char temp = set[start];
            set[start] = set[end];
            set[end] = temp;
        //    System.out.println(temp);
            start++;
            end--;
        }
        return new String(set);
    }

    public static void main(String args[]){
        String s = "hello";
        System.out.println(reverseVowels(s));
    }
}
