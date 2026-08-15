class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        s = ""
        i,j = 0,0
        while i<len(word1) and j<len(word2):
            s+= word1[i]
            s+= word2[j]
            i+=1
            j+=1
        
        
        if i<len(word1):
            while i<len(word1):
                s+= word1[i]
                i+=1
        else :
            while j<len(word2):
                s += word2[j]
                j+=1

        return s