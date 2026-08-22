class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> res = new HashMap<>();

       for(String s: strs){
        char[] arr=s.toCharArray();
        Arrays.sort(arr);

        String sortedStr=new String(arr);
       res.putIfAbsent(sortedStr, new ArrayList<>());
       res.get(sortedStr).add(s);
       }
       return new ArrayList<>(res.values());
    }

}
