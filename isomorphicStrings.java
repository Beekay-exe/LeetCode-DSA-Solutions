import java.util.HashMap;

public class isomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int sizeofS = s.length();
        int sizeoft = t.length();
        //base case
        if(sizeoft != sizeofS) return false;

        HashMap<Character, Integer> memorys = new HashMap<>();
        HashMap<Character, Integer> memoryt = new HashMap<>();
        for(int i=0;i<sizeofS;i++){
            if(!memorys.containsKey(s.charAt(i))){
                memorys.put(s.charAt(i),i);
            }
            if(!memoryt.containsKey(t.charAt(i))){
                memoryt.put(t.charAt(i),i);
            }
            if(!memorys.get(s.charAt(i)).equals(memoryt.get(t.charAt(i)))){
                return false;
            }

        }
        return true;
    }
}
