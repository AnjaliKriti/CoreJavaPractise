package org.example.service.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BalancedArray {
    //    Balanced Array : {1,0,-3,0,-1,3,0}
    //    Balanced Array : {5,-1,0,-5,-7,1,0, 7}
    //    Not Balanced Array : {2,0,8,3,-2,0,-8} --> -3 is missing
    //    Not Balanced Array : {1,-1, 0, 3 , -2, -1 } --> -3, 2, 1 are missing
    public static void main(String[] args) {


            int arr[] = {1,0,-3,0,-1,3,0};

            Boolean result = isBalanced(arr);
            System.out.println("Number is balanced " + result);
    }

    public static boolean isBalanced(int arr[]) {
        List<Integer> positiveNumber = new ArrayList<>();
        List<Integer> negativeNumber = new ArrayList<>();

        for (int num: arr) {
            if( num > 0) {
                positiveNumber.add(num);

            }else if ( num < 0)  {
                negativeNumber.add(-num);
            }
        }

        if ( positiveNumber.size() != negativeNumber.size()) {
            return  false;
        } else{
            Collections.sort(positiveNumber);
            Collections.sort(negativeNumber);
            if (positiveNumber.equals(negativeNumber)){
                return  true;
            }
        }

        return false;

    }
}
