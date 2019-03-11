/*Arranging Coins
*You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.
/
class ArrangingcoinsSolution {
    public int arrangeCoins(int n) {
    if(n==0)
        return 0;
        int level=0;
        while(n>0)
        {
            level++;
            n=n-level;
            
            
        }
        if(n<0)
            return --level;
        else
            return level;
        
    }
}