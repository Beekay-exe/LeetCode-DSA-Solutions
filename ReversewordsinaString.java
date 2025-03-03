public class ReversewordsinaString {
    public String reverseWords(String s) {
        int left = 0;
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        while(left< s.length()){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp.append(ch);
            }
            else
            {
                if(temp.length()>0){
                    if(ans.length() > 0){
                        ans.insert(0," ");
                    }
                    ans.insert(0,temp);
                    temp.setLength(0);
                }
            }
            left++;
        }
        if(temp.length()>0){
            if(ans.length()>0){
                ans.insert(0," ");
            }
            ans.insert(0,temp);
        }
        return ans.toString();
    }
}
