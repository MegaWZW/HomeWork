package Home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    public void showAllElements (int[] arr) {
        for (int item : arr) {
            System.out.print(item + ", ");
        }
        System.out.print("\b\b\n");
    }
}
