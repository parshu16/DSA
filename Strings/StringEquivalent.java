package DSA.Strings;

// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true.
public class StringEquivalent {
    public static void main(String[] args) {
        String[]word1={"ab","c"};
        String[]word2={"a","bc"};
        String s1="",s2="";
        for(String s:word1){
            s1+=s;
        }
        for(String s:word2){
            s2+=s;
        }
        System.out.println(s1.equals(s2));//true
    }
}
