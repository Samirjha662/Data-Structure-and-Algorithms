1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!= t.length()) return false;
4        HashMap<Character, Integer> map = new HashMap<>();
5
6        for(int i = 0 ; i< s.length() ;i++){
7            char ch = s.charAt(i);
8            map.put(ch, map.getOrDefault(ch,0)+1);
9        }
10
11        for(int i =0; i< t.length() ;i++){
12           char ch = t.charAt(i);
13            if(!map.containsKey(ch)){
14                return false;
15            }else{
16                map.put(ch, map.getOrDefault(ch, 0) - 1);
17                if(map.get(ch) ==0){
18                    map.remove(ch);
19                }
20                
21            }
22        }
23
24        if(map.isEmpty()) return true;
25        return false;
26        
27    }
28}