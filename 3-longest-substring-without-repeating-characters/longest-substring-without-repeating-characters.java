class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int i = 0, j = 0;
        int maxLen = 0;

        while (j < s.length()) {

            if (!set.contains(s.charAt(j))) {

                set.add(s.charAt(j));
                j++;

            } else {
                char dup=s.charAt(j);
                maxLen=Math.max(maxLen,j-i);
                while(s.charAt(i)!=dup){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
        }
        int len=j-i;
        maxLen=Math.max(maxLen,j-i);

        return maxLen;
    }
}