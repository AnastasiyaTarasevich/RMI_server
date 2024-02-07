package org.example;

import java.rmi.RemoteException;

public class MyMathImpl implements MyMath {

    @Override
    public int[] Factorials(int[] num) throws RemoteException {
        int[] factor=new int[num.length];
        for(int i=0;i< num.length;i++)
        {
            factor[i]=calculateFactorial(num[i]);
        }
        return factor;
    }


        private static int calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }


    @Override
    public double[] SqureRoots(int[] num) throws RemoteException {
       double[]squre =new double[num.length];
       for(int i=0;i< num.length;i++)
       {
           squre[i]= Math.sqrt(num[i]);
       }
       return squre;
    }
}
