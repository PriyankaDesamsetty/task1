/*Arranging Coins
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