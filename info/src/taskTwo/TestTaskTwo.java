package taskTwo;


import java.util.Arrays;

public class TestTaskTwo {
    // In this Class we create a few Unit test to test algorithm of sorting.
    public void testSortArrayPositive_1(){
        TaskTwo a = new TaskTwo();
        int[] arr = {5, 1, 10, 4, 56};
        int[] result;
        result = a.sortArray(arr);
        // This is what we expected to get and it will right result.
        int[] expectedResult = {1, 4, 5, 10, 56};
        if (Arrays.equals(result, expectedResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }

    }
    public void testSortArrayPositive_2(){
        TaskTwo a = new TaskTwo();
        int[] arr = {-2, -100, 4, 100, 0, 5};
        int[] result;
        result = a.sortArray(arr);
        // This is what we expect to get from function and it will right result.
        int[] expectedResult = {-100, -2, 0, 4, 5, 100};
        if (Arrays.equals(result, expectedResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }

    }
    public void testSortArrayPositive_3(){
        TaskTwo a = new TaskTwo();
        int[] arr = {};
        int[] result;
        result = a.sortArray(arr);
        // This is what we expect to get from function and it will right result.
        int[] expectedResult = {};
        if (Arrays.equals(result, expectedResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }

    }
    public void testSortArrayNegative(){
        TaskTwo a = new TaskTwo();
        int[] arr = {1, 9, 2, 5, -2};
        int[] result;
        result = a.sortArray(arr);
        // This is what we expect to get from function and it will right result.
        int[] expectedResult = {-2, 1, 2, 9, 5};
        if (!Arrays.equals(result, expectedResult)){
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }
    }


    public static void main(String[] args) {
        TestTaskTwo ex = new TestTaskTwo();
        ex.testSortArrayPositive_1();
        ex.testSortArrayPositive_2();
        ex.testSortArrayPositive_3();
        ex.testSortArrayNegative();
    }
}
