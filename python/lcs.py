''' Longest Common Subsequence ''' 

'''

Example 
str1 = "abc"
str2 = "bcd"

ans = 2 = "bc"

'''
#Using Memorization
def fibb1(s1,s2,i,j,dp):  
    if i<0 or j<0 :
        return 0 
    if dp[i][j] != -1:
        return dp[i][j]
    if s1[i] == s2[j]:
        dp[i][j] = 1 + fibb1(s1,s2,i-1,j-1,dp)
    else:
        dp[i][j] = 0 + fibb1(s1,s2,i-1,j,dp), fibb1(s1,s2,i,j-1,dp))
    
    return dp[i][j]
  

#Using Tabulation
def fibb2(s1,s2):
    n = len(s1)
    m = len(s2)
    
    dp = [[0 for _ in range(m+1)] for _ in range(n+1)]
    for i in range(1,n+1):
        for j in range(1,m+1):
            if s1[i-1] == s2[j-1]:
                dp[i][j] = 1 + dp[i-1][j-1]
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])
    
    return dp[n][m]
  

if __name__ == "__main__":
  s1 = "abc"
  s2 = "bcd"
  n = len(s1)
  m = len(s2)
  dp = [[-1 for _ in range(m)] for _ in range(n)]
  ansmemo = fibb1(s1,s2,n-1,m-1,dp)
  print(ansmemo)
  
  anstab = fibb2(s1,s2)
  print(anstab)
  
