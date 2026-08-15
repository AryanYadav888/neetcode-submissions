class Solution:
    def helper(self,arr:List[int],i:int,j:int) -> None:
        while i<j:
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp

            i+=1
            j-=1
    def rotate(self, arr: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(arr)
        k = k%n

        self.helper(arr,0,n-k-1)
        self.helper(arr,n-k,n-1)
        self.helper(arr,0,n-1)
        