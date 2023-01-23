#Minimum Window Substring
#---------------------------------------------------------------------------------


class Solution:
	
    def minWindow(self, s: str, t: str) -> str:       
        counter = collections.Counter(t)
        l, r = 0, 0   
        count = len(t)
        min_window_start = 0
        min_window_len = len(s) + 1 
        while r < len(s):           
            counter[s[r]] -= 1            
            if counter[s[r]] >= 0:
                count -= 1           
            r += 1
            while count == 0:              
                if (r-l) < min_window_len:
                    min_window_len = r-l
                    min_window_start = l               
                counter[s[l]] += 1                
                if counter[s[l]] > 0:
                    count += 1              
                l += 1
        if min_window_len == len(s) + 1:
            return ""
        else:
            return s[min_window_start:min_window_start + min_window_len]