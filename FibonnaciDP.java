import java.util.Arrays;
class Solution {
    public int fib(int n) {
        int storage[] = new int[n+1];
        Arrays.fill(storage,-1);
        return fib(n,storage);
    }
    public int fib (int n,int storage[])
    {
        if(n==0 || n==1)
            return n;
        if(storage[n] != -1)
            return storage[n];
        int c1 = fib(n-1,storage);
        int c2 = fib(n-2,storage);
        
        int c = c1+c2;
        storage[n] = c;
        return c;
    }
}