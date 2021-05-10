package com.company.F2;

public class Controller {
    public int minimum(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++)
            if(min < array[i]) min = array[i];
        return min;
    }
    public int[] betweenIndex(int[] array, int min, int max) {
        int[] new_array = new int[max-min];
        for(int i = 0; i < max-min; i++) {
            new_array[i] = array[min + i];
        }
        return new_array;
    }

    //dois arrays de inteiros e determinar o array com os elementos comuns aos dois arrays.
    public int[] comuns(int[] a, int[] b) {
        int[] new_array = new int[a.length];
        Boolean found = false;
        int k = 0;                                 //index for newArray
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length && found != true; j++) {
                if(a[i] == b[j]) {
                    found = true;
                    new_array[k++] = a[i];
                }
            }
        }
        return  new_array;
    }
}
