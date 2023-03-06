package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {14,16,20,21,25,26,30,34,44,51,55,59,62,65,69,74,88};
        int kay = 4;
        int position = binarySearch(array,kay);
        System.out.println(kay + " position " +position);
    }

    static int binarySearch(int [] array, int kay){
        int position =0;
        int left =0;
        int right =array.length-1;

        while (left<=right){
            int middle = (left+right)/2;
            if(array[middle]==kay){
                System.out.println("Kay found ");
                return middle;
            }

            if(array[middle]< kay){
                System.out.println("Cut left half ");
               left = middle+1;
            }
            if(array[middle]>kay){
                System.out.println("Cut right half ");
                right = middle-1;
            }
        }
        System.out.println("Kay not found");
        return -1;
    }
}
