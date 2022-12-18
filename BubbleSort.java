package AlgorithmProblems;

public class BubbleSort {
    public static void printArray(int array[]){
        System.out.println("Print Array :");
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={9,3,5,7,2,1};

        for (int i = 0; i< array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }
}
