package taskOne;

public class TaskOne {
    // Function take tow index and calculate it using some special formula.
    public double findValueFromFormula(int indI, int indJ){
        double firstPart = Math.sin(Math.sin(-1.49));
        double secondPart = (4*Math.log10(Math.log10(23.4)))/Math.pow(indI, indJ);
        double result = Math.sqrt(Math.abs(firstPart - secondPart));
        return result;
    }
    // This function take one argument two-dimensional array and
    // find max element and it indexes in array and call
    // function findValueFromFormula to calculate value.
    // Return of function is value from function findValueFromFormula, type double.
    public double findMaxElemAndItValue(int[][] arr){
        if (!(arr.length == 0)){
            int maxEmel = arr[0][0];
            int indexI = 0;
            int indexJ= 0;
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[1].length; j++){
                    if (maxEmel < arr[i][j]){
                        maxEmel = arr[i][j];
                        indexI = i;
                        indexJ = j;
                    }
                }
            }
            return findValueFromFormula(indexI, indexJ);
        }
        else {
            throw new IllegalArgumentException("Empty arr");
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                {100, 2, 3},
                {4, 8, 9},
                {10, 50, 1}
        };
        TaskOne a = new TaskOne();
        System.out.println(a.findMaxElemAndItValue(arr));

    }
}
