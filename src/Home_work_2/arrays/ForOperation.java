package Home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    public void showAllElements (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b\n");
    }

    @Override
    public void showEverySecondElement (int[] arr){
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b\n");
    }

    @Override
    public void reverseArray(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\b\b\n");
    }
}
