class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            boolean flag = true;
            for(List<String> l : result) {
                flag = true;
                    String str = l.get(0).toLowerCase();
                    int[] arr = new int[26];
                    for(int j = 0; j < str.length(); j++) {
                        arr[str.charAt(j) - 97]++;
                    }
                    for(int k = 0; k < strs[i].length(); k++) {
                        if(arr[strs[i].toLowerCase().charAt(k) - 97] >= 1) {
                            arr[strs[i].toLowerCase().charAt(k) - 97]--;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        l.add(strs[i]);
                        break;
                    }
            }
            if(!flag || result.size() == 0) {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                result.add(temp);
            }
        }
        return result;
    }
}
