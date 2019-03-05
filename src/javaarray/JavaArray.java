// Создайте массив из 20 случайных  чётных целых чисел. 
// Вычислите среднее арифметическое элементов массива 
// без учёта минимального и максимального элементов массива.
package javaarray;

import java.util.Arrays;

public class JavaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random() * 100) + 1;
            if (a % 2 == 0) {
                array[i] = a;
            } else {
                array[i] = a + 1;
            }
        }

        System.out.println("массив из 20 случайных  чётных целых чисел " + Arrays.toString(array) + "\n");
        
        int minEl = array[0];
        int maxEl = array[0];
        
        for(int i=1; i<array.length; i++){
            if(array[i] < minEl){
                minEl = array[i];
            }
            
            if(array[i] > maxEl){
                maxEl = array[i];
            }
        }
        System.out.println("min " + minEl + "; max " + maxEl + "\n");
        
        int count = array.length;
        Arrays.sort(array);

        System.out.println("Отсортированный массив из 20 случайных  чётных целых чисел " + Arrays.toString(array) + "\n");

        int min = array[0];
        int max = array[count - 1];

        System.out.println("min " + min + "; max " + max + "\n");
        
        


        int allSum = 0;
        for (int i = 0; i < count; i++) {
            allSum += array[i];
        }
        System.out.println("Сумма всех чисел массива " + allSum + "\n");

        int sum = allSum - (min + max);
        System.out.println("Сумма чисел массива без учёта минимального и максимального элементов " + sum + "\n");

        int x = sum / 18;
        System.out.println("среднее целочисленное арифметическое элементов массива  " + x + "\n");

        double y = (double) sum / 18;
        System.out.println("среднее арифметическое элементов массива  " + y + "\n");
    }

}
