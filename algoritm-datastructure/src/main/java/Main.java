import array.DArray;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        myArray();
    }

    private static void myArray(){
        System.out.println(new Date());
        DArray<Integer> dArray = new DArray<>(200000000);

        for (int i = 0; i <100000000 ; i++) {
            dArray.add(i);
        }
        System.out.println(new Date());
        System.out.println(dArray.size());
    }

    private static void baseArray(){
        System.out.println(new Date());
        ArrayList<Integer> arr = new ArrayList<>(10000);

        for (int i = 0; i <100000000 ; i++) {
            arr.add(i);
        }
        System.out.println(new Date());
        System.out.println(arr.size());
    }
}
