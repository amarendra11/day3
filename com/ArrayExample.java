package bridgelabz.com;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args){
       int arr[] = new int[5];
       int arr1[] = new int[]{1, 2, 3};
     //   System.out.println("Array 1" + Arrays.toString(arr1));

       // System.out.println("before Array" + Arrays.toString(arr));
        int k = 1;
        for (int i = 0; i < arr.length ; i++) {
        arr[i] = k;
        k++;

        }
        //System.out.println("after Array" + Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
            }

        }
    }

