class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Character>[] bucket = new List[s.length()+1];
        for(char key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        String ans = "";
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                for(char c:bucket[i]){
                    for(int j=1; j<=i; j++){
                        ans += c + "";
                    }
                }
            }
        }
        return ans;
    }
}