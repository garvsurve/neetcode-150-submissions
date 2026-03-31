class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int [] char_freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char_freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            char_freq[t.charAt(i)-'a']--;
            if(char_freq[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
