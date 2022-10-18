//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int a, b, c;
    Pair(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
}

class Solution {
    int shortestPath(int[][] grid, int[] source, int[] destination) {
    int[][] temp=new int[grid.length][grid[0].length];
        Queue<Pair> st1=new LinkedList<>();
        st1.add(new Pair(source[0],source[1],1));
        temp[source[0]][source[1]]=-1;

        if(source[0]==destination[0]  && source[1]==destination[1])return 0;
        while(!st1.isEmpty()){
            Pair pp=st1.peek();
            int a=pp.a;
            int b=pp.b;
            int c=pp.c;

            int[][] arr={{1,0},{-1,0},{0,1},{0,-1}};
            for(int i=0; i<4; i++){
                int A=a+arr[i][0];
                int B=b+arr[i][1];

                if(A>=0 && B>=0 && B<grid[0].length && A<grid.length && grid[A][B]==1&& temp[A][B]!=-1){
                    st1.add(new Pair(A,B,c+1));
                    temp[A][B]=-1;
                    if(destination[0]==A && destination[1]==B){
                        return c;
                    }
                }
            }
            st1.remove();
        }
        return -1;
    }
}