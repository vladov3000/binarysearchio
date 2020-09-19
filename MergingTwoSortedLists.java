import java.util.*;


class Solution {
    public int[] solve(int[] lst0, int[] lst1) {
        int[] res = new int[lst0.length + lst1.length];
        int a = 0;
        int b = 0;
        
        while (a < lst0.length && b < lst1.length) {
            res[a+b] = lst0[a] < lst1[b] ? lst0[a] : lst1[b];
            if (lst0[a] < lst1[b]) a++;
            else b++;
        }
        
        while(a < lst0.length) res[a+b] = lst0[a++];
        while(b < lst1.length) res[a+b] = lst1[b++];
        return res;
    }
    
    public int[] solve1(int[] lst0, int[] lst1) {
        int[] res = new int[lst0.length + lst1.length];
        int a = 0;
        int b = 0;
        while (a < lst0.length || b < lst1.length) {
            if (b > lst1.length - 1 || 
                (a < lst0.length && lst0[a] < lst1[b])){
                res[a + b] = lst0[a];
                a++;
            } else if (b < lst1.length) {
                res[a + b] = lst1[b];
                b++;
            }
        }
        return res;
    }
}
