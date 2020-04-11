class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_count = 0;
        ArrayList<Character> ss = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(!ss.contains(s.charAt(i))){
                ss.add(s.charAt(i));
                max_count = Math.max(max_count,ss.size());
            }
            else{
                i--;
                ss.remove(0);
            }
        } 
        return max_count;
    }
}
