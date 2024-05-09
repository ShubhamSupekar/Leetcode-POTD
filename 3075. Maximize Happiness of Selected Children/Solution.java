class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int i = happiness.length-1;
        long sum = 0;
        long minusVal = 0;
        while(k>0){
            long addVal = happiness[i]-minusVal;
            if(addVal<0){addVal = 0;}
            sum+=addVal;
            k-=1;
            i-=1;
            minusVal+=1;
        }
        return sum;
    }
}