class Solution:
    def maxArea(self, arr: List[int]) -> int:
        n = len(arr)
        ans = 0
        l,r=0,n-1
        while l<r:
            minval = min(arr[l],arr[r])
            width = r-l
            if arr[l] <= arr[r]:
                l += 1
            else :
                r -= 1
            ans = max(ans,minval*width)

        return ans