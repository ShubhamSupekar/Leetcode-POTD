class Solution:
    def xorAllNums(self, nums1: List[int], nums2: List[int]) -> int:
        # If the length of array is even, XOR all elements of arry is 0
        xor1 = 0
        xor2 = 0
        
        for num in nums1:
            xor1 ^= num

        for num in nums2:
            xor2 ^= num
        
        if len(nums2) % 2 == 0:
            xor1 = 0
        if len(nums1) % 2 == 0:
            xor2 = 0
        
        return xor1 ^ xor2