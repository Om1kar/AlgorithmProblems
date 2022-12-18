package AlgorithmProblems;

public class InsertionSort {
    public static void printArray(int array[]){
        System.out.println("Final Array =");
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array1[] = {9, 3, 5, 7, 2, 1};

        for (int i = 0; i < array1.length; i++) {
            int current = array1[i];
            int j = i - 1;
            while (j >= 0 && current < array1[j]) {
                array1[j + 1] = array1[j];
                j--;
            }
            array1[j+1]=current;
        }
        printArray(array1);
    }
}
