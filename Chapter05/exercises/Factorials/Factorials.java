/*
 *       Filename:  Factorials.java
 *
 *    Description:  5.13 - Write an application that calculates the factorials
 *                  of 1 through 20. Use type long. Display the result in
 *                  tabular format.
 *
 *        Created:  06/10/15 23:46:30
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Factorials{
    public static void main(String[] args){
        for(int i=0; i<20; i++){
            System.out.printf("%d\n", getFactorial(i));
        }
    }
    // compute and return factorial
    // x! = x-1 * x-1 * x-1 * x-1 ...
    private static long getFactorial(int x){
        long factorial = x;

        if(x > 1)
            x--;

        while(x > 0){
            factorial *= x;
            x--;
        }
        return factorial;
    }
}
