package edu.cscc;
import java.util.Arrays;
public class BubbleSort {
    private static Object String;
//
    public static void sort(String[] list) {


            boolean changed = true;
            do {
                changed = false;
                for (int j = 0; j <= list.length - 2; j++)
                    if (list[j].compareTo(list[j +1])>0){
                        //swap list[j] wiht list[j+1]
                        String temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                        changed = true;
    }
}while (changed);
}
}