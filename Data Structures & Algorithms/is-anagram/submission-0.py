class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = sorted(s)
        t = sorted(t)

        if len(s) != len(t):
            return False
        
        n = len(s)
        for i in range(n):
            if s[i] != t[i]:
                return False

        return True