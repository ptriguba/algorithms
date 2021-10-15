package com.app01.fibonacci;

public class Fibonacci {

    //0,1,1,2,3,5,8

    public int[] makeNumbers(int n){
        int[] data = new int[n];
        if(n==0){
            return data;
        }
        if(n==1){
            data[0]=0;
            return data;
        }
        data[0]=0;
        data[1]=1;
        for(int i=2;i<n;i++){
            data[i] = data[i-1]+data[i-2];
        }
        return data;
    }
}
