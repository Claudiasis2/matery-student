
/**
 * Write a description of class Fibo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibo
{
    public int fib(int n){
        int res;
        if(n < 0){
            res = fib(n*-1) * -1;
        } else {        
            if(n==0){
                res = 0;
            } else {
                if(n==1){
                    res = 1;
                } else{
                    res = fib(n-2) + fib(n-1);
                }
            }
        }
        return res;
    }
}
