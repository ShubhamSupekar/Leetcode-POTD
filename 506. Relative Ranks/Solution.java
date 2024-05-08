class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<score.length;i++){
            arrayList.add(score[i]);
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        String[] ans = new String[score.length];
        for(int i=0;i<score.length;i++){
            int idx = arrayList.indexOf(score[i]);
            if(idx == 0){
                ans[i] = "Gold Medal";
            }else if(idx == 1){
                ans[i] = "Silver Medal";
            }else if(idx == 2){
                ans[i] = "Bronze Medal";
            }else{
                int j = idx+1;
                String s = ""+j;
                ans[i] = s;
            }
        }
        return ans;
    }
}