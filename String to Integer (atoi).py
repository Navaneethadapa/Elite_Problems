class Solution:
    def myAtoi(self, s: str) -> int:
        sign=1
        s=s.strip()
        ans=0
        i=0
        if not s:
            return 0
        if s[0]=="-":
            sign=-1
            i+=1
        elif s[0]=="+":
            i+=1
        while i<len(s):
            d=ord(s[i])-ord('0')
            if d>=0 and d<=9:
                ans=(ans*10)+d
            else:
                break
            i+=1
        if ans*sign<-2**31:
            return -2**31
        elif ans*sign>(2**31)-1:
            return (2**31)-1
        return ans*sign