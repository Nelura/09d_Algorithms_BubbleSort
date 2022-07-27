package com.cc.java;

public class BubbleSort {

    /**
     *  dyn. Anteile --> im Objekt
     */

    private int[] liste = {5, 1, 4, 9, 0, 8, 6};

    public int[] sortieren() 
    {
        int tmp;
        
        for(int i = 1; i < liste.length; i++)
        {
            for (int j = 0; j < (liste.length - i); j++) 
            {
                if (liste[j] > liste[j + 1]) {  // a : b
                    tmp = liste[j];
                    liste[j] = liste[j + 1];
                    liste[j + 1] = tmp; // b : a
                }
            }
        }
            return liste;
    }

    /**
     * stat. Anteile --> in der Klasse
     */
    public static void main(String[] args) 
    {
        BubbleSort bs = new BubbleSort();
        printArray(bs.liste);
        System.out.println("--------------");
        printArray(bs.sortieren());
    }

    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
            System.out.println();
    }

}

