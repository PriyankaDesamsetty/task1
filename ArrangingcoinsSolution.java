/*Arranging Coins
input
Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.

Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.

*/
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