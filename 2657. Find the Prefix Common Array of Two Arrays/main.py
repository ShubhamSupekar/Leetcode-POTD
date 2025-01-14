class Solution:
    def count_same(self,a,b,count):
        for num in a:
            if num in b:
                count+=1    
        return count



    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        ans = []
        count = 0
        for i in range(len(A)):
            ans.append(self.count_same(A[:i+1],B[:i+1],count))

        return ans
