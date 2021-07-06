package taskTwo;


public class TaskTwo {
    //Method printing one-dimensional array.
    //Return of this function is one-dimensional array that sorted in ascending order.
    public void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // This is sort by selection.
    public int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
        return arr;
    }
    //This method create one-dimensional array.
    //For random value using method random() from library Math.
    //Return of this function is one-dimensional array that has random value.
    public int[] createSortedArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        return arr;
    }

    public static void main(String[] args) {
        //Unit tests located in TestTaskTwo class
        //Just make some smoke test to be make sure that program work right
        TaskTwo a = new TaskTwo();
        int[] arr = a.createSortedArray(5);
        System.out.println("Created arr with random value:");
        a.printArr(arr);
        arr = a.sortArray(arr);
        System.out.println("\nSorted arr:");
        a.printArr(arr);

    }
}
