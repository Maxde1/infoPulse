package taskOne;

public class TestTaskOne {
    public void positiveTest1(){
        TaskOne a = new TaskOne();
        int[][] testArray = {
                {1, 2, 4, 5},
                {5, 6, 35, 100}
        };
        double resultOfFunction = a.findMaxElemAndItValue(testArray);
        double expect = 1.1771115457620858;
        if (expect == resultOfFunction){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

    }
    public void positiveTest2(){
        TaskOne a = new TaskOne();
        int[][] testArray = {};

        try {
            double resultOfFunction = a.findMaxElemAndItValue(testArray);
            System.out.println("Test Failed");
        }
        catch (Exception e){
            System.out.println("Test Passed");
        }

    }

    public static void main(String[] args) {
        TestTaskOne a = new TestTaskOne();
        a.positiveTest1();
    }
}
