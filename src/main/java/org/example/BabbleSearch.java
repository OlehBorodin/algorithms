package org.example;

public class BabbleSearch {
    public static void main(String[] args) {
        int [] arrayMin={3,2,1};
        int [] arrayMax={22,34,1,4,67,43,90,11,23,36,12,10,88,71,29,13,8,61,3};
        babbleSearch(arrayMax);
    }

    static void babbleSearch(int[]array){

        int comparisonDone =0;
        int swapsDone =0;
        boolean shorted = false;
        while (!shorted){
            shorted = true;
            for (int i=0; i <array.length-1; i++){
                printArray(array);
                if(array[i]>array[i+1]){
                    System.out.println("Swap " + array[i] + " and " + array[i+1]);
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapsDone++;
                    shorted = false;
                }else{
                    System.out.println(" Not need to change elements  " + i + " and " + (i+1));
                }
                comparisonDone ++;

            }
        }

        System.out.println("Arrays size " + array.length);
        System.out.println(" Comparison Done " + comparisonDone);
        System.out.println("Swaps Done " + swapsDone);
    }

     static void printArray(int[] array){
        for (int i =0; i< array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");

        }
         System.out.println();
     }
}
