package selectionSort;

import java.util.Arrays;

public class selectionSort {
    public static int[] sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int pointerMin = i;
            for (int j = i; j < array.length; j++){
                if (array[j] < array[pointerMin]){
                    pointerMin = j;
                }

            }
            swap(array,pointerMin,i);
        }
        return array;

        }

        public static void swap (int[] number, int j , int k){
        int temp = number[j];
        number[j] = number[k];
        number[k] = temp;
        }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new int[]{4, 7, 5, 2, 3,12,6,8,22,15})));
    }

    }


