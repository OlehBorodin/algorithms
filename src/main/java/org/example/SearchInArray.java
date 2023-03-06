package org.example;

public class SearchInArray {
    public static void main(String[] args) {
        int [] arraySmall = {1,2,3,55,56,67,85,65,54,52,90};
        printMaxElement(arraySmall);
    }



    static void printMaxElement(int [] array){
        int max = array[0];
        int maxIndex =0;
        int comparisons = 0;
        int replacement = 0;

        for (int i=0; i<array.length; i++){
            if(array[i]> max){
                max = array[i];
                maxIndex = i;
                replacement++;
            }
            comparisons++;
        }
        System.out.println("Max element " + max);
        System.out.println("Max element index " + maxIndex);
        System.out.println("Comparisons " + comparisons);
        System.out.println("Replacement " + replacement);
    }
}
