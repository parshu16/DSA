package DSA.Strings;

// Input: num = "51230100"
// Output: "512301"
// Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
public class RemoveTrailing {
    public static void main(String[] args) {
        String s="531230100";
        StringBuilder sb=new StringBuilder(s);
        for(int i=s.length()-1;i>0;i--){
            char ch=s.charAt(i);
            if(ch=='0'){
                sb.deleteCharAt(i);
            }
            else{
                break;
            }

        }
        System.out.println(sb.toString()); //5312301
    }
}
