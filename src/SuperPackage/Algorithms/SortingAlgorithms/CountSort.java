package SuperPackage.Algorithms.SortingAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void main(String[] args) {
        int [] arr = {8,4,2,5,1,3,6};
        CountSortHash(arr);
        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.toString(arr));
    }
    public static void countSort( int [] array){
        if(array == null || array.length <= 1){
            return;
        }
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        int [] countArray = new int[max + 1];
        for(int num : array){
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max ; i++) {
            while(countArray[i] > 0){
                array[index] = i;
                index++;
                countArray[i]--;
            }
        }
        return;
    }
    public static void CountSortHash(int [] array ) {
        if (array == null || array.length <= 1) {
            return;
        }
        int index = 0;

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : array){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                array[index] = i;
                index++;
            }
        }
    }
}