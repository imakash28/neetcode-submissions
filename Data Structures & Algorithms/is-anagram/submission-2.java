class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sStr=s.toCharArray();
        char[] tStr=t.toCharArray();
        if(s.length()!=t.length()){
            return false;
        }
        Arrays.sort(sStr);
        Arrays.sort(tStr);
        return Arrays.equals(sStr, tStr);
    }
}
