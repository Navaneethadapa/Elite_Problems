from collections import Counter
class Solution:
    def longestSubstring(self, s, k):
        ctr = Counter(s)
        for c,v in ctr.items():
            if v<k:
                return max([self.longestSubstring(sub, k) for sub in s.split(c) if len(sub)>=k] or [0])
        return len(s)