package com.app02.factorial;

public class Factorial {

//5! = 1*2*3*4*5

   /* n=5

    0) res=1;
    1)_ res = res*1 = 1;
2) res = res*2 = 1*2
    3) res = res *3 = 2*3*/

    //1*4=4


    public int makeFactorial(int n){
        int res = 1;
        for(int i=2;i<=n;i++){
            res = res*i;
            //System.out.println("step # "+i);
        }
        return res;
    }


}
