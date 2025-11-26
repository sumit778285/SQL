class Solution(object):
    def lengthOfLastWord(self, s):
        count=0
        m=0
        # remove trailing spaces (important!)
        s = s.rstrip()
        s=s.lstrip()
        for i in range(0,len(s)):
            if(s[i]==' '):
                m=i
        if(m==0):
            for i in range(0,len(s)):
                count=count+1
        else:
            for i in range(m+1,len(s)):
                count=count+1

        return count
        